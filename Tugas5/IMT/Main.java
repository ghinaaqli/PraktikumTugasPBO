import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di Kalkulator IMT");
        System.out.print("Masukkan berat badan (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggi = input.nextDouble();

        double hasilIMT = IMT.hitungIMT(berat, tinggi);
        String kategoriIMT = IMT.tentukanKategoriIMT(hasilIMT);

        System.out.println("\nHasil IMT: " + hasilIMT);
        System.out.println("Kategori IMT: " + kategoriIMT);

        input.close();
    }
}
