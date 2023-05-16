import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class _Files{
    public static void main(String[] args) throws IOException {
        var pathToCSV = Path.of("./content/3.programacion/_pruebas-java/random-persons.csv");
        if (Files.exists(pathToCSV)) {
            System.out.println("Puedo leer el archivo! ");
        }

        var fileAsStream = Files.readAllLines(pathToCSV);
        fileAsStream.stream().forEach(System.out::println);

        var newFilePath =  Path.of("./content/3.programacion/_pruebas-java/myNewFile.txt");
        var file = Files.createFile(newFilePath);
        var linesForNewFile = List.of(" Esta es la primera línea", "segunda línea", "Última línea!!");
        Files.write(newFilePath, linesForNewFile);


        var dirName = "C:/Users/Jano/Downloads";
         /*
            A continuación, recuperamos dos niveles de recursividad del árbol de directorios y se filtra para quitar
            los nombres de los directorios y mostrar solo los de los archivos pdf
        */

        try (Stream<Path> paths = Files.walk(Paths.get(dirName), 2)) {
            paths.map(path -> path.toString()).filter(f -> f.endsWith(".pdf"))
                    .forEach(System.out::println);
        }

        /*
            A continuación, recuperamos dos niveles de recursividad del árbol de directorios y se filtra para quitar
            los nombres de los directorios y mostrar solo los de los archivos.
        */

        try (Stream<Path> paths = Files.walk(Paths.get(dirName), 2)) {
            paths.filter(Files::isRegularFile)
                    .forEach(System.out::println);
        }
    }
}