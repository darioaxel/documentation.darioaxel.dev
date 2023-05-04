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
    }
}