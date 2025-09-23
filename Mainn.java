/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Mainn {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota Avanza", 120, 4, 4);
        SepedaMotor motor = new SepedaMotor("Yamaha R15", 150, 2, "4-Tak");

        mobil.tampilkanInfo();
        System.out.println();

        motor.tampilkanInfo();
    }
}
