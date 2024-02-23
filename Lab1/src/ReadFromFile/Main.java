//Citire din fisier
package ReadFromFile;

import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "Lab1/src/ReadFromFile/in.txt";
        System.out.println(new File(".").getAbsoluteFile());
        BufferedReader fluxIn;
        fluxIn = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        String line;


    }
}
