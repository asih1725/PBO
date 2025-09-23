/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Kucing extends Hewan {

    public Kucing(String nama) {
        super(nama, "Kucing");
    }

    // Overriding metode tampilkanInfo()
    @Override
    public void tampilkanInfo() {
        System.out.println("=== Informasi Kucing ===");
        super.tampilkanInfo();  // memanggil metode induk
    }

    // Metode khusus suara
    public void suara() {
        System.out.println(nama + " bersuara: Meong Meong!");
    }
}

