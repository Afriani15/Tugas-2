/*NIM          : 13020200068
  Nama         : AFRIANI
  Hari/Tanggal : Selasa, 22 Maret 2022
  Waktu        : 06:04 PM
*/

import java.util.Scanner;

public class If2 {

/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
/* Kamus */
 
int a;
Scanner masukan=new Scanner(System.in);
 
/* Program */

System.out.print ("Contoh IF dua kasus \n");

System.out.print ("Ketikkan suatu nilai integer :"); a=masukan.nextInt();

if (a >= 0){
System.out.println ("Nilai a positif "+ a);
}else /* a< 0 */
{
 
System.out.println ("Nilai a negatif "+ a);
}

}

}
