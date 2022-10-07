package mx.uabc.cursojava.exceptions;

import java.io.*;

public class SimpleDemoException {
    public static void main(String[] args)  {
        int i = 15;
        int j= 0;

        try {

            File f = new File("c:\\ArchivoQueNoexiste.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine())!=null) {

            }

            int resultado = i /j;


        }
        catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        catch(ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }

    }
}
