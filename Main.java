/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author ASUS
 */
 public class Main {
     public static void main(String[] args) {
         Hewan kucing = new Hewan("Jojo", 5);
         kucing.suara();
         kucing.info();
     
         Hewan anjing = new Hewan("Popi", 5);
         anjing.suara();
         anjing.info(); 
     }
 }
