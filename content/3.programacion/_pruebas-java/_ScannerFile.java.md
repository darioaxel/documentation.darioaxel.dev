import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class _ScannerFile {
  public static void main(String[] args) {

    // Creamos un objeto de la case Scanner que leerá desde la entrada del sistema, usando la coma como separador
    File f = new File("./content/3.programacion/_pruebas-java/random-persons.csv");
    
    try {
      Scanner input = new Scanner(f);
      input.useDelimiter(",");
      while(input.hasNextLine()) {
        var linea = input.nextLine();
        System.out.println("tamaño " + linea.split(";").length + " - " + linea);
      }
      // Cerramos el objeto Scanner
      input.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}