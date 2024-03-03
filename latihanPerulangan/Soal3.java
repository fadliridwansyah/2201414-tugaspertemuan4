/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanPerulangan;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {
        // Scanner untuk menerima input dari pengguna
        Scanner masukan = new Scanner(System.in);
        
        // Meminta pengguna memasukkan nilai N
        System.out.print("Masukkan nilai N (antara 1 dan 1000): ");
        int N = masukan.nextInt();
        
        // Validasi nilai N agar berada dalam rentang yang benar
        if (N < 1 || N > 1000) {
            System.out.println("Nilai N harus berada antara 1 dan 1000.");
            return;
        }
        
        // Mencetak pola bintang sesuai dengan nilai N
        System.out.println("N = " + N );
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
