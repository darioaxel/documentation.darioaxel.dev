import java.nio.file.Files;
import java.util.Scanner;

class App {
  public static void main(String[] args) {

    // Creamos un objeto de la case Scanner que leerá desde la entrada del sistema, usando la coma como separador
    Scanner input = new Scanner(System.in);
    System.out.print("Escribe una línea de texto: ");

    // Recupera la línea completa como cadena
    String myText = input.nextLine();
    for(var t : myText.split(",")) {
      System.out.println(t);
    }    
  
    // Cerramos el objeto Scanner
    input.close();
  }
}