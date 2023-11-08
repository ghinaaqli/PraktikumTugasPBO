import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("NPM: ");
        String NPM = input.nextLine();

        System.out.print("Nama Mahasiswa: ");
        String Nama = input.nextLine();

        System.out.print("Nilai Kehadiran: ");
        double NilaiKehadiran = input.nextDouble();

        System.out.print("Nilai Tugas: ");
        double NilaiTugas = input.nextDouble();

        System.out.print("Nilai UTS: ");
        double NilaiUTS = input.nextDouble();

        System.out.print("Nilai UAS: ");
        double NilaiUAS = input.nextDouble();

        Mahasiswa mahasiswa = new Mahasiswa(NPM, Nama, NilaiKehadiran, NilaiTugas, NilaiUTS, NilaiUAS);
        mahasiswa.tampilkanInformasi();

        input.close(); 
    }
}