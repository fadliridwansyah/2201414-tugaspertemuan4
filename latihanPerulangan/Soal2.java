/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
        // Scanner untuk menerima input dari pengguna
        Scanner masukan = new Scanner(System.in);
        
        // Meminta pengguna memasukkan batas awal dan batas akhir
        System.out.print("Masukkan batas awal: ");
        int awal = masukan.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int akhir = masukan.nextInt();
        
        // Menampilkan bilangan prima dalam rentang yang ditentukan
        System.out.print("Bilangan prima dari " + awal + " hingga " + akhir + " adalah: ");
        for (int i = awal; i <= akhir; i++) {
            if (apakahPrima(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Membuat baris baru
        
        // Menampilkan bilangan komposit dalam rentang yang ditentukan
        System.out.print("Bilangan komposit dari " + awal + " hingga " + akhir + " adalah: ");
        for (int i = awal; i <= akhir; i++) {
            if (!apakahPrima(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Membuat baris baru
    }
    
    // Fungsi untuk memeriksa apakah suatu bilangan adalah prima atau bukan
    public static boolean apakahPrima(int angka) {
        if (angka <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }
}
