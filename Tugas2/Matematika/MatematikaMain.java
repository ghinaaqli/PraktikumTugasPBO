public class MatematikaMain {
    public static void main(String[] args) {
        Matematika kalkulator = new Matematika();

        int hasilTambah = kalkulator.pertambahan(5, 3);
        System.out.println("Hasil Pertambahan: " + hasilTambah);

        int hasilKurang = kalkulator.pengurangan(8, 2);
        System.out.println("Hasil Pengurangan: " + hasilKurang);

        int hasilKali = kalkulator.perkalian(4, 6);
        System.out.println("Hasil Perkalian: " + hasilKali);

        double hasilBagi = kalkulator.pembagian(10, 2);
        System.out.println("Hasil Pembagian: " + hasilBagi);

        double hasilPembagianNol = kalkulator.pembagian(5, 0);
        System.out.println("Hasil Pembagian (dengan nol): " + hasilPembagianNol);
    }
}
