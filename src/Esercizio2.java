import java.util.Scanner;


public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci il numero");
        int test = scan.nextInt();
        System.out.println(intero(test));
        scan.close();

    }
    public static String intero(int numero) {
        String risultato;
        switch (numero) {
            case 0: {
                risultato = "zero";
                break;
            }
            case 1: {
                risultato = "uno";
                break;
            }
            case 2: {
                risultato = "due";
                break;
            }
            case 3: {
                risultato = "tre";
                break;
            }
            default:
                risultato = "Numero non compreso tra 0 e 3, impossibile convertire";
        }
        return risultato;
    }
}
