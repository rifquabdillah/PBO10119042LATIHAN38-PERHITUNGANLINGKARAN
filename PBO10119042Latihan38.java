/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo;
import java.util.Scanner;
/**
 *
 * @author Muhammad Rifqu Abdillah
 *  Nama : Muhammad Rifqu Abdillah
 *  Kelas: Pbo-IF1
 *  Nim : 10119042 
 *  Deskripsi : Program ini berisi untuk menghitung dan menampilkan jari jari,luas,dan keliling lingkaran dengan konsep OO
 */
public class PBO10119042Latihan38 {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        PehitunganLingkaran lingkaran = new PehitunganLingkaran();
        
        System.out.println("=====Perhitungan Lingkaran=====");
        System.out.print("Masukan nilai diameter lingkaran : ");
        while(true){
            try{
                PehitunganLingkaran.diameter = Double.parseDouble(scanner.next());
                break;
        }catch (NumberFormatException e){
            System.out.println("Nilai diamater tidak  sesuai\n");
            continue;
        }
    }
        double jarijari = PehitunganLingkaran.hitungJariJari();
        double luas = PehitunganLingkaran.hitungLuas();
        double keliling = PehitunganLingkaran.hitungKeliling();
        System.out.println();
        System.out.println("=====Hasil Perhitungan Lingkaran=====");
        System.out.printf("Jari-jari Lingkaran\t\t = %.2f%n", jarijari);
        System.out.printf("Luas Lingkaran\t\t\t =  %.2f%n", luas);
        System.out.printf("Keliling Lingkaran\t\t = %.2f%n", keliling);
}
}