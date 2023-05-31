import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SerializedFiles {
    public static void main(String[] args) {
        
        Path filePath = Paths.get("serialized.data");
        if (Files.notExists(filePath)) {
            try {
                Files.createFile(filePath);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        Avion avion1 = new Avion("test1", 30);
        avion1.addTripulante(new Tripulante("Dario", "80"));
        avion1.addTripulante(new Tripulante("Lola", "20"));
        Avion avion2 = new Avion("test2", 5);

        ArrayList<Avion> aviones = new ArrayList<Avion>(Arrays.asList(avion1, avion2));
        System.out.println(escribirFichero(filePath, aviones));

        for(var a : leerFichero(filePath)) {
            System.out.println(a);
        }
        
        
    }
    private static boolean escribirFichero(Path filePath, ArrayList<Avion> aviones ) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath.toString());
            ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(aviones);
                oos.close();
            } catch (SecurityException | IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }       
        return true;
    }

    private static ArrayList<Avion> leerFichero(Path filePath){
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(filePath.toString());
            ObjectInputStream ois = new ObjectInputStream(fileInputStream);
            return (ArrayList<Avion>) ois.readObject();            
       
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}