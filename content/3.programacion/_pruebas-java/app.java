import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class app {
    public static void main(String[] args) {
        Path path = new Path();
        try {
            path = Files.createFile(Path.of("./content/3.programacion/_pruebas-java/prueba.txt"));
          
        } catch (Exception e) {
            System.out.println("Falló");
        }
        if( Files.exists(path) ){
            System.out.println("Yes");
        }
       
    }
}