/*
Să se insereze într-o anumită poziție a unui șir de caractere, un alt șir. Datele vor fi
preluate de la tastatură sau din fișier. Să se șteargă o porțiune a unui șir de caractere care
începe dintr-o anumită poziție și are un anumit număr de caractere. Se recomandă utilizarea
clasei StringBuilder.
 */

import java.util.Scanner;

public class InsertSir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduceți sirul: ");
        String inputString = scanner.nextLine();
        System.out.print("\nIntroduceți subsirul: ");
        String subString = scanner.nextLine();
        System.out.print("\nIntroduceți pozitia de inserat: ");
        int pos = scanner.nextInt();

        String resultString2 = stergereSubstring(inputString, pos, subString.length());
        System.out.println(resultString2);

        String resultString1 = inserareSubstring(resultString2, subString, pos);
        System.out.println(resultString1);



    }

    public static String inserareSubstring(String original, String substring, int position) {
        StringBuilder builder = new StringBuilder(original);
        builder.insert(position, substring);
        return builder.toString();
    }

    public static String stergereSubstring(String original, int startPosition, int length) {
        StringBuilder builder = new StringBuilder(original);
        builder.delete(startPosition, startPosition + length);
        return builder.toString();
    }
}
