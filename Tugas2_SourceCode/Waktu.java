/*NIM          : 13020200068
  Nama         : AFRIANI
  Hari/Tanggal : Selasa, 22 Maret 2022
  Waktu        : 07:45 PM
*/

import java.util.Scanner;

public class Waktu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int totaljam, totalmenit, totaldetik, jamsekarang, konversi;

		System.out.print("Berapa detik yang ingin anda konversikan : ");
		konversi=input.nextInt();

		totaljam = konversi/3600;
		totalmenit = (konversi%3600)/60;
		totaldetik = (konversi%3600)%60;
		jamsekarang = totaljam %24;

		System.out.println("konversi dari : "+konversi+"detik, Adalah :");
		System.out.println(jamsekarang+"jam saat ini ");
		System.out.println(totaljam+"jam,"+totalmenit+"menit,"+totaldetik+"detik");
	}
}