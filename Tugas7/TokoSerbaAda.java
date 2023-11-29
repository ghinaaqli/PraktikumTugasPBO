import java.util.Scanner;

public class TokoSerbaAda {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Toko Serba Ada");
        System.out.println("**************");

        System.out.print("Masukkan Item Barang\t: ");
        int itemCount = input.nextInt();

        String[] kodeBarang = new String[itemCount];
        String[] namaBarang = new String[itemCount];
        int[] hargaBarang = new int[itemCount];
        int[] jumlahBeli = new int[itemCount];
        int[] jumlahBayar = new int[itemCount];

        for (int i = 0; i < itemCount; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode\t\t: ");
            kodeBarang[i] = input.next();

            String[] kodeBarangValid = {"a001", "a002", "a003"};
            String[] namaBarangValid = {"Buku", "Pensil", "Pulpen"};
            int[] hargaBarangValid = {3000, 4000, 5000};

            boolean kodeValid = false;
            for (int j = 0; j < kodeBarangValid.length; j++) {
                if (kodeBarang[i].equals(kodeBarangValid[j])) {
                    namaBarang[i] = namaBarangValid[j];
                    hargaBarang[i] = hargaBarangValid[j];
                    kodeValid = true;
                    break;
                }
            }

            if (!kodeValid) {
                System.out.println("Kode Barang tidak valid");
                i--; 
                continue;
            }

            System.out.print("Masukkan jumlah Beli\t: ");
            jumlahBeli[i] = input.nextInt();

            jumlahBayar[i] = hargaBarang[i] * jumlahBeli[i];
        }

        System.out.println("\nTOKO SERBA ADA");
        System.out.println("**************************");
        System.out.println("No\tKode Barang\tNama Barang\tHarga\tJumlah Beli\tJumlah Bayar");
        System.out.println("=============================================================================");
        int totalBayar = 0;
        for (int i = 0; i < itemCount; i++) {
            System.out.println((i + 1) + "\t" + kodeBarang[i] + "\t\t" + namaBarang[i] + "\t\t" +
                    hargaBarang[i] + "\t" + jumlahBeli[i] + "\t\t" + jumlahBayar[i]);
            totalBayar += jumlahBayar[i];
        }
        System.out.println("=============================================================================");
        System.out.println("Total Bayar\t\t\t\t\t\t\t" + totalBayar);
        System.out.println("=============================================================================");

        input.close();
    }
}