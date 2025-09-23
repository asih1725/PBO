/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Kitty");
        Anjing anjing = new Anjing("Buddy");

        kucing.tampilkanInfo(); // Memanggil versi override
        kucing.suara();         // Memanggil metode khusus kucing
        System.out.println();

        anjing.tampilkanInfo(); // Memanggil versi override
        anjing.suara();         // Memanggil metode khusus anjing
    }
}

