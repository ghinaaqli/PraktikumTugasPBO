public class MatematikaInheritance {
    public static void main(String[] args) {
        int tambahHasilMatematika = Matematika.tambah(20, 10);
        System.out.println("Pertambahan (Matematika): 20 + 10 = " + tambahHasilMatematika);

        int kurangHasilMatematika = Matematika.kurang(10, 5);
        System.out.println("Pengurangan (Matematika): 10 - 5 = " + kurangHasilMatematika);

        int kaliHasilMatematika = Matematika.kali(10, 3);
        System.out.println("Perkalian (Matematika): 10 * 3 = " + kaliHasilMatematika);

        double bagiHasilMatematika = Matematika.bagi(21, 2);
        System.out.println("Pembagian (Matematika): 21 / 2 = " + bagiHasilMatematika);

        int modulusHasilMatematika2 = Matematika2.modulus(21, 4);
        System.out.println("Modulus (Matematika2): 21 % 4 = " + modulusHasilMatematika2);
    }
}
