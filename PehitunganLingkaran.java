/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo;

/**
 *
 * @author Muhammad Rifqu Abdillah
 *  Nama : Muhammad Rifqu Abdillah
 *  Kelas: Pbo-IF1
 *  Nim : 10119042 
 *  Deskripsi : Program ini berisi untuk menghitung dan menampilkan jari jari,luas,dan keliling lingkaran dengan konsep OO
 */
public class PehitunganLingkaran {
    private static double jarijari, luas, keliling;
    public static double diameter;
    private static final double PHI =3.14;
    
    public static double hitungJariJari(){
        jarijari = diameter/2;
        return jarijari;
    }
    public static double hitungLuas(){
        luas = PHI  * jarijari * jarijari;
        return luas;
    }
     public static double hitungKeliling(){
         keliling = PHI * diameter;
         return keliling;
     }
}
