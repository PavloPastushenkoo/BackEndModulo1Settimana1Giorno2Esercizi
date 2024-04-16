import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserire un numero seguito dal tasto Invio");
        int test = scan.nextInt();
        rovescia(test);
        scan.close();
    }
    public static void rovescia(int numero){
        for(int i = numero; i>0; i--) {
            System.out.println(i);
        }
        }

    }

