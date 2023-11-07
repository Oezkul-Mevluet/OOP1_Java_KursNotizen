package tag_02_dataCasting_modules;

import java.util.Scanner;

public class Modules {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie drei zahlige Ganzzahl ein: ");
        int eingegebenenZahl = scanner.nextInt();

        int birlerBasamagi;
        int summeVonZiffern=0;

        birlerBasamagi = eingegebenenZahl % 10;
        summeVonZiffern = summeVonZiffern + birlerBasamagi;

        eingegebenenZahl = eingegebenenZahl / 10;

        birlerBasamagi = eingegebenenZahl % 10;
        summeVonZiffern = summeVonZiffern + birlerBasamagi;

        eingegebenenZahl = eingegebenenZahl / 10;
        summeVonZiffern = summeVonZiffern + eingegebenenZahl;

        System.out.println("Summe von eingegebenen Zahlen sind : " + summeVonZiffern);

    }
}
