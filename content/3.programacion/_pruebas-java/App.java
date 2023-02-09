import java.nio.file.Files;
import java.util.Scanner;

class App {
  public static void main(String[] args) {

    // Creamos un objeto de la case Scanner que leerá desde la entrada del sistema, usando la coma como separador
    Scanner input = new Scanner(System.in).useDelimiter(",");

    System.out.print("Escribe una línea de texto: ");

    // Recupera la línea completa como cadena
    while (input.hasNext()) {
        String myText = input.next();
        System.out.println("Token: " + myText);
        if (input.hasNext())  System.out.println("Say Yeah!");
        else System.out.println("Say Nai!");
    }
  
    // Cerramos el objeto Scanner
    input.close();
  }
}