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
        KeranjangBelanja keranjang = new KeranjangBelanja();

        keranjang.tambahProduk(new Buku("Buku Java", 100000));
        keranjang.tambahProduk(new Elektronik("Headphone", 500000));
        keranjang.tambahProduk(new Pakaian("Kaos", 150000));

        System.out.println("Total harga setelah diskon: " + keranjang.totalHargaSetelahDiskon());
    }
}

