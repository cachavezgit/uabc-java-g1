package mx.uabc.cursojava.streams;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcesarArchivoStreams {
    public static void main (String[] args)  throws Exception{
        Set<String> palabrasUnicas = Files.lines(
                Path.of("C:\\Users\\cachavez\\curso-java\\Matematico\\Lineas.txt"))
                .flatMap(line -> Stream.of(line.split(" ")))
                .collect(Collectors.toSet());

        TreeSet<String> ordenado = new TreeSet<>(palabrasUnicas);

        for(String palabra:ordenado) {
            System.out.println(palabra);
        }

        Files.list(Path.of("c:\\windows"))
                .filter(Files::isDirectory)
                .forEach(d -> System.out.println(d));

        System.out.println("-------");

        Files.list(Path.of("c:\\windows\\system32"))
                .filter(Files::isRegularFile)
                .filter(f-> f.getFileName().toString().endsWith(".txt"))
                .forEach(f -> System.out.println(f));
    }
}
