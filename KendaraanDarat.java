/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class KendaraanDarat extends Kendaraan {
    int jumlahRoda;

    public KendaraanDarat(String nama, int kecepatan, int jumlahRoda) {
        super(nama, kecepatan);
        this.jumlahRoda = jumlahRoda;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("=== Informasi Kendaraan Darat ===");
        super.tampilkanInfo();
        System.out.println("Jumlah Roda   : " + jumlahRoda);
    }
}

