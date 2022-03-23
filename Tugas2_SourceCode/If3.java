/*NIM          : 13020200068
  Nama         : AFRIANI
  Hari/Tanggal : Selasa, 22 Maret 2022
  Waktu        : 09:11 PM
*/

import java.util.Scanner;

public class If3 {

/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
/* Kamus */
 
int a;
Scanner masukan=new Scanner(System.in);
 
/* Program */
System.out.print ("Contoh IF tiga kasus \n"); System.out.print ("Ketikkan suatu nilai integer :"); a=masukan.nextInt();
if (a > 0){
System.out.println ("Nilai a positif "+ a);
}else if (a == 0){
System.out.println ("Nilai Nol "+ a);
}else /* a > 0 */ {
System.out.println ("Nilai a negatif "+ a);
}

}

}
