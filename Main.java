import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. BukuFiksi");
        System.out.println("2. BukuNonFiksi");
        System.out.print("Isikan pilihan: ");
        int pilihan = sc.nextInt();
    
        if (pilihan == 1) {
            BukuFiksi bf = new BukuFiksi( 3,120000);
            System.out.println(bf);
            bf.info(); // Memanggil method info() dari kelas BukuFiksi
        } else if (pilihan == 2) {
            BukuNonFiksi bnf = new BukuNonFiksi(20);
            System.out.println(bnf);
            bnf.info(); // Memanggil method info() dari kelas BukuNonFiksi
        } else {
            System.out.println("Pilihan tidak valid");
        }
    }
}
