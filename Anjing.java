/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Anjing extends Hewan {

    public Anjing(String nama) {
        super(nama, "Anjing");
    }

    // Overriding metode tampilkanInfo()
    @Override
    public void tampilkanInfo() {
        System.out.println("=== Informasi Anjing ===");
        super.tampilkanInfo();  // memanggil metode induk
    }

    // Metode khusus suara
    public void suara() {
        System.out.println(nama + " bersuara: Guk Guk!");
    }
}
