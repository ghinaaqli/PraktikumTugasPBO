import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Total Pembelian Rp. ");
        double totalPembelian = input.nextDouble();

        Pembelian pembelian = new Pembelian(totalPembelian);
        pembelian.tampilkanInfoPembelian();

        input.close();
    }
}