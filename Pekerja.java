/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak3;

/**
 *
 * @author ASUS
 */
public class Pekerja extends Manusia {
    // Atribut tambahan
    private double gaji;

    // Constructor
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan);  // panggil constructor dari Manusia
        this.gaji = gaji;
    }

    // Getter dan Setter untuk gaji
    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Override toString
    @Override
    public String toString() {
        return "Nama: " + getNama() +
               ", Usia: " + usia +
               ", Pekerjaan: " + pekerjaan +
               ", Gaji: " + gaji;
    }
}
