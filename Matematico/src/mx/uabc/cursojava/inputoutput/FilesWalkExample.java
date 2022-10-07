package mx.uabc.cursojava.inputoutput;

import java.io.IOException;
import java.nio.file.*;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilesWalkExample {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get(System.getProperty("java.io.tmpdir"));

        List<Path> subDirectories = Files.walk(path, 2)
                .filter(Files::isDirectory)
                .collect(Collectors.toList());

        Stream<Path> fileNames = Files.list(path).filter(Files::isDirectory);
        fileNames.limit(5).forEach(System.out::println);

        Files.walkFileTree(path, Collections.emptySet(), 2, new SimpleFileVisitor<Path>() {


            @Override
            public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                System.out.println("visitFileFailed: " + file);
                return FileVisitResult.CONTINUE;
            }
        });
    }

}
