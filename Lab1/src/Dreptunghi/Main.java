//Aria dreptunghiului
package Dreptunghi;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati prima latura: ");
        int a = scanner.nextInt();
        System.out.println("Dati a doua latura: ");
        int b = scanner.nextInt();
        int perimetru = a*2 + b*2;
        int arie = a*b;
        System.out.println("Aria este: "+arie + "\nPerimetrul este: "+perimetru);
    }
}
