/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal3_p4;

/**
 *
 * @author Elliora Orva Linnisa
 */

import java.util.Scanner;

public class Soal3_P4 {

      public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = masukan.nextInt();

        int hasilFaktorial = 1;
        for (int i = 1; i <= n; i++) {
            hasilFaktorial *= i;
        }

        System.out.print(n + "! = ");
        for (int i = n; i >= 1; i--) {
            if (i == 1) {
                System.out.print(i);
            } else {
                System.out.print(i + " * ");
            }
        }
        System.out.println(" = " + hasilFaktorial);
    }
}