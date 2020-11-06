/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119912.latihan36.targetsaldotabungan;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA  : Rezki Ramadhan
 * KELAS : IF10K
 * NIM  `: 10119912
 * 
 */

class Saldo{
     public int saldoAkhir;
     public int saldo = 3500000;
     public int bunga = 8;
     public int target = 6000000;

public void hitung(int a, int b){
     saldoAkhir = (a + (a*b/100));
    }
}

public class IF10K10119912Latihan36TargetSaldoTabungan {
    
    public static void main(String[] args) {
            DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        Saldo sld = new Saldo();
        
        
        for (int i = 1; i <= i; i++){
            sld.hitung(sld.saldo,sld.bunga);
            System.out.println("Saldo di bulan ke-"+i+" " + kursIndonesia.format(sld.saldoAkhir));
            sld.saldo = sld.saldoAkhir;
         if(sld.saldoAkhir >= sld.target)
             break;
        }
    }
    
}
