/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2_p4;

/**
 *
 * @author Elliora Orva Linnisa
 */

import java.util.Scanner;

public class Soal2_P4 {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);

        System.out.print("Masukkan batas awal: ");
        int batasAwal = masukan.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = masukan.nextInt();

        int jumlahBilanganGanjil = 0;
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 != 0) {
                jumlahBilanganGanjil++;
            }
        }

        System.out.println("Banyaknya bilangan ganjil dari " + batasAwal + " sampai " + batasAkhir + " adalah " + jumlahBilanganGanjil);
    }
}
