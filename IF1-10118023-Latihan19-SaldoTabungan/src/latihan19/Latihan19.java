/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan19;

/**
 * @author Zaenal PC
 * NAMA              : Zaenal Anzarry
 * KELAS             : IF-01
 * NIM               : 10118023
 * Deskripsi Program : Saldo Tabungan
 */

public class Latihan19 {

    public static void main(String[] args) {
        //kamus lokal
        double saldo = 2500000;
        double bunga;
        
        for (int i = 1; i <= 6; i++) {
            bunga = saldo * 0.15;
            saldo = saldo + bunga;
            System.out.println("Saldo di bulan ke-" + i + " Rp " + saldo);
        }
        
        System.out.println("");
        System.out.println("Developed by : Zaenal Anzarry");
            
    } 
    
}
