/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanPerulangan;

/**
 *
 * @author Lenovo
 */
//Buatlah algoritma dalam bahasa Java, yang menerima masukan berupa 3 buah integer,
//periksa apakah masukan adalah ribuan

import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {
        // Membuat scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        // Array untuk menyimpan tiga angka
        int[] angka = new int[3];
        
        // Meminta pengguna memasukkan tiga angka
        for (int i = 0; i < 3; i++) {
            System.out.print("Masukkan angka ke-" + (i+1) + ": ");
            angka[i] = scanner.nextInt();
        }
        
        // Memeriksa setiap angka dan menampilkan output
        for (int i = 0; i < 3; i++) {
            if (isRibuan(angka[i])) {
                System.out.println("Angka ke-" + (i+1) + ": " + angka[i] + " adalah ribuan");
            } else {
                System.out.println("Angka ke-" + (i+1) + ": " + angka[i] + " adalah bukan ribuan");
            }
        }
    }
    
    // Fungsi untuk memeriksa apakah angka tersebut adalah ribuan
    public static boolean isRibuan(int angka) {
        return angka >= 1000 && angka <= 9999;
    }
}

