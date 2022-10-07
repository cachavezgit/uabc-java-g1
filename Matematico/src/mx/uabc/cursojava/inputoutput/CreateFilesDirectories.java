package mx.uabc.cursojava.inputoutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class CreateFilesDirectories {
    public static void main(String[] args) {
        String pathString = System.getProperty("user.home") + "/javaTemp/";
        Path pathDirectory = Paths.get(pathString);
        if(Files.exists(pathDirectory)) {
            System.out.println("WARNING: directory exists already at: " + pathString);
        } else {
            try {
                // Create the directory
                Files.createDirectories(pathDirectory);
                System.out.println("New directory created at: " + pathString);
            } catch (IOException ioe) {
                System.out.println("Could not create the directory");
                System.out.println("EXCEPTION: " + ioe.getMessage());
            }
        }

        String fileName = "temp.txt";
        Path pathFile = Paths.get(pathString + fileName);
        String text = "Hola,\nme da un refresco,\npor favor?";
        if(Files.exists(pathFile)) {
            try {
                Files.write(pathFile, Arrays.asList(text), StandardOpenOption.TRUNCATE_EXISTING);
                System.out.println("Text added to the file: " + pathFile);
            } catch (IOException ioe) {
                System.out.println("EXCEPTION: " + ioe.getMessage());
            }

        } else {
            try {
                // Create the file
                Files.createFile(pathFile);
                System.out.println("New file created at: " + pathFile);
            } catch (IOException ioe) {
                System.out.println("Could not create the file");
                System.out.println("EXCEPTION: " + ioe.getMessage());
            }
        }
    }
}
