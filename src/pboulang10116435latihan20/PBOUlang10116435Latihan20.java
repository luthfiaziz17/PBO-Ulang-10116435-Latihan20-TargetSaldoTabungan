/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang10116435latihan20;

/**
 *
 * @author Luthfi
 * NIM  : 10116435
 * NAMA : Luthfi Aziz Al PAqih
 */
public class PBOUlang10116435Latihan20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int i = 0;
        int saldoTabungan = 3500000;
        double bunga = 0.08;
        double saldoBulanan;
        
        while (saldoTabungan <= 6000000) {
            i = i + 1;
            saldoBulanan = bunga * saldoTabungan;        
            saldoTabungan = (int) (saldoTabungan + saldoBulanan);
            System.out.println("Saldo di bulan ke-" + i + " Rp." + saldoTabungan);
    }
    
    }
}
