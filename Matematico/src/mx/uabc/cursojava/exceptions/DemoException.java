package mx.uabc.cursojava.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class DemoException {
    public static void main(String[] args) throws IOException {
        List<String> lines = Collections.emptyList();
        try {
            lines = Files.readAllLines(Paths.get("readme.txt"));
        } catch (NoSuchFileException fe) {
            System.out.println("Exception: File Not Found");
        }
    }

}
