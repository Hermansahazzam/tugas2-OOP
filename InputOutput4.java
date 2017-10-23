import java.util.Scanner;

public class InputOutput4 {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		String nama;
		char jenisKelamin;
		int tinggiBadan;
		boolean menikah;
	System.out.print("Masukan nama : ");
		nama = input.nextLine();
	System.out.print("Masukan Jenis Kelamin : ");
		jenisKelamin = input.next().charAt(0);
	System.out.print("Masukan Tinggi Badan : ");
		tinggiBadan = input.nextInt();
	System.out.print("Masukan Status Menikah (true/false) : ");
		menikah = input.nextBoolean();
		System.out.println("----------------------------------------------------------------");
		System.out.print("Nama anda adalah               :");System.out.println(nama);
		System.out.print("Jenis jenisKelamin anda adalah :");System.out.println(jenisKelamin);
		System.out.print("Tinggi badan anda adalah       :");System.out.println(tinggiBadan);
		System.out.print("Status menikah anda adalah     :");System.out.println(menikah);
	}
}
