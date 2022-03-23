/*NIM          : 13020200068
  Nama         : AFRIANI
  Hari/Tanggal : Selasa, 22 Maret 2022
  Waktu        : 06:00 PM
*/

import java.util.Scanner;

public class If1 {
	/**
	 * @param args
	 */
	public static void main (String[] args) {
		// TODO Auto-generated method stub
		Scanner masukan=new Scanner(System.in);
		int a;

		System.out.print ("Contoh IF kasus \n");
		System.out.print ("ketikkan suatu nilai integer : ");
		a = masukan.nextInt();
		if (a >= 0)
		System.out.print ("\nNilai a positif"+ a);
	}
}