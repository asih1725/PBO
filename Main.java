/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3_tugas;

/**
 *
 * @author ASUS
 */

public class Main {
    public static void main(String[] args) {
        // Membuat dua object Mobil
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2020, "Hitam");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2022, "Putih");

        // Menampilkan informasi mobil
        mobil1.displayInfo();
        mobil2.displayInfo();

        // Menyalakan mesin
        mobil1.startEngine();
        mobil2.startEngine();

        // Mengubah warna mobil1
        mobil1.setWarna("Merah");
        System.out.println("Setelah diubah warna:");
        mobil1.displayInfo();
    }
}

