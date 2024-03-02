/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1_p4;

/**
 *
 * @author Elliora Orva Linnisa
 */

import java.util.Scanner;

public class Soal1_P4 {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        System.out.print("Masukkan n: ");
        int n = masukan.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }   
}
