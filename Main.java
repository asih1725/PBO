/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak3;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek pekerja
        Pekerja p1 = new Pekerja("Andi", 25, "Programmer", 7000000);

        // Tampilkan data dengan toString()
        System.out.println(p1.toString());

        // Ubah nama pekerja dengan setter
        p1.setNama("Budi");
        System.out.println("Setelah nama diubah:");
        System.out.println(p1.toString());

        // Coba akses langsung atribut
        // System.out.println(p1.nama);       // ERROR → karena nama private
        System.out.println(p1.usia);          // Bisa diakses (protected) karena di subclass/main dalam package sama
        System.out.println(p1.pekerjaan);     // Bisa diakses (public)
        // System.out.println(p1.gaji);      // ERROR → karena gaji private
    }
}
