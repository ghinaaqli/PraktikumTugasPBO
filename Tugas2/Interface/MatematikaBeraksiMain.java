public class MatematikaBeraksiMain {
    public static void main(String[] args) {
        Matematika kalkulator = new Matematika();

        int angka1 = 20;
        int angka2 = 10;

        int hasilTambah = kalkulator.pertambahan(angka1, angka2);
        int hasilKurang = kalkulator.pengurangan(angka1, angka2);
        int hasilKali = kalkulator.perkalian(angka1, angka2);
        double hasilBagi = kalkulator.pembagian(21, 2);

        System.out.println("Pertambahan: " + angka1 + " + " + angka2 + " = " + hasilTambah);
        System.out.println("Pengurangan: " + angka1 + " - " + angka2 + " = " + hasilKurang);
        System.out.println("Perkalian: " + angka1 + " * " + angka2 + " = " + hasilKali);
        System.out.println("Pembagian: 21 / 2 = " + hasilBagi);
    }
}
