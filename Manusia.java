/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak3;

/**
 *
 * @author ASUS
 */
public class Manusia {
    // Atribut dengan akses modifier sesuai ketentuan
    private String nama;       // private → hanya bisa diakses dalam class ini
    protected int usia;        // protected → bisa diakses oleh subclass
    public String pekerjaan;   // public → bisa diakses dari mana saja

    // Constructor
    public Manusia(String nama, int usia, String pekerjaan) {
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}