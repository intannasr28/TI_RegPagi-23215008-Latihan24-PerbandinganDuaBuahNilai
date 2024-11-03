package pert6;

import java.util.Scanner;

public class PerbNilai {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ulangi;

        System.out.println("==== Program Perbandingan Nilai ====");

        do {
            
            System.out.print("Masukkan nilai pertama: ");
            int nilaiPertama = input.nextInt();

            System.out.print("Masukkan nilai kedua: ");
            int nilaiKedua = input.nextInt();

            if (nilaiPertama > nilaiKedua) {
                System.out.println("Hasil: " + nilaiPertama + " lebih besar dari " + nilaiKedua);
            } else if (nilaiPertama < nilaiKedua) {
                System.out.println("Hasil: " + nilaiPertama + " lebih kecil dari " + nilaiKedua);
            } else {
                System.out.println("Hasil: " + nilaiPertama + " sama dengan " + nilaiKedua);
            }

            System.out.print("Ulangi aktivitas? (Ya/Tidak): ");
            ulangi = input.next();
            System.out.println();

        } while (ulangi.equalsIgnoreCase("Ya"));

        System.out.println("Program selesai.");
    }
}


