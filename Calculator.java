import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        int bil1, bil2, pil, hasil = 0;
        System.out.println("PROGRAM JAVA KALKULATOR SEDERHANA");
        System.out.println("1.Perkalian");
        System.out.println("2.Pembagian");
        System.out.println("3.Penjumlahan");
        System.out.println("4.Pengurangan");
        System.out.println("---------------------------------");
        System.out.println("Masukan Pilihan Anda :");
        pil = input.nextInt();

        System.out.println("---------------------------------");
        System.out.println("Bilangan 1 :");
        bil1=input.nextInt();
        System.out.println("Bilangan 2 :");
        bil2=input.nextInt();

        switch(pil) {

            case 1:
                hasil = bil1 * bil2;

            case 2:
                hasil = bil1 / bil2;

            case 3:
                hasil = bil1 + bil2;

            case 4:
                hasil = bil1 - bil2;

            default:
                System.out.println("Pilihan Yang Anda Masukan Salah");
        }

        System.out.println("Hasil Perhitungan :" +hasil);
    }
}
