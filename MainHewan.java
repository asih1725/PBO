/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum9;

/**
 *
 * @author acer
 */
public class MainHewan {
    public static void main(String[] args) {
        Hewan kucing = new Kucing(); // membuat objek Kucing
        Hewan anjing = new Anjing(); // membuat objek Anjing

        // memanggil metode suara()
        kucing.suara();
        anjing.suara();
    }
}