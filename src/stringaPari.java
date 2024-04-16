public class stringaPari {
    public static void main(String[] args) {
        stringaPariDispari("Ciaoa");

    }

    public static void stringaPariDispari(String str) {
        if (str.length() % 2 != 1) {
            System.out.println("La stringa e pari");
        } else {
            System.out.println("La stringa e dispari");
        }
    }
}



