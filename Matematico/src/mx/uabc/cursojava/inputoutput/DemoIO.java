package mx.uabc.cursojava.inputoutput;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DemoIO {
    public static void main(String[] args) throws Exception{
        String pathString = System.getProperty("java.io.tmpdir");
        List<String> fileNames = new ArrayList<>();
        DirectoryStream<Path> directoryStream;
        directoryStream = Files.newDirectoryStream(Paths.get(pathString));
        for (Path path : directoryStream) {
            fileNames.add(path.toString());
        }
        for (int i = 0; i < 50; i++ ) {
            System.out.println(fileNames.get(i));
        }
    }
}
