package Ex1;
/*
Fișierul judete_in.txt, conține lista neordonată a județelor din țară. Să se încarce
datele din fișier într-un tablou de String-uri și să se ordoneze acest tablou cu ajutorul metodei
sort() din clasa Arrays. Să se returneze pe ce poziție se află în vectorul ordonat un județ
introdus de la tastatură. Se va utiliza metoda de căutare binară din clasa Arrays.

 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;




public class Main {


public static String[] ReadJudete (String inputFile){
    try {
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        String line;
        StringBuilder content = new StringBuilder();

        while ((line = reader.readLine()) != null) {
             content.append(line).append("\n"); // scrie in content cu append fiecare linie + \n
         }
        System.out.println("Continut citit cu" + "succes!\n");
        return content.toString().split("\n"); // returneaza continutul separat de \n
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}

public static void afiseazaJudete(String[] judete){
    for(String judet : judete){
        System.out.println(judet);
    }
}


    public static void main(String[] args) {
        String [] judete = ReadJudete("src/Ex1/judete.txt");
        Arrays.sort(judete);
        afiseazaJudete(judete);
        System.out.println("Dati judetul de cautat: ");

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        int poz;
            if ((poz = Arrays.binarySearch(judete, line)) >= 0)
                System.out.println("Judetul se afla pe pozitia " + poz + " in ordine alfabetica\n");
            else
                System.out.println("Judetul nu este prezent!\n");
    }
}
