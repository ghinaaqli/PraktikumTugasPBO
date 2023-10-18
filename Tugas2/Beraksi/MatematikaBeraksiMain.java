public class MatematikaBeraksiMain {
    public static void main(String[] args) {
        
        int tambahHasil = tambah(20, 10);
        System.out.println("Pertambahan: 20 + 10 = " + tambahHasil);

        int kurangHasil = kurang(10, 5);
        System.out.println("Pengurangan: 10 - 5 = " + kurangHasil);

        int kaliHasil = kali(10, 3);
        System.out.println("Perkalian: 10 * 3 = " + kaliHasil);

        double bagiHasil = bagi(21, 2);
        System.out.println("Pembagian: 21 / 2 = " + bagiHasil);
    }

    public static int tambah(int a, int b) {
        return a + b;
    }

    public static int kurang(int a, int b) {
        return a - b;
    }

    public static int kali(int a, int b) {
        return a * b;
    }

    public static double bagi(double a, double b) {
        return a / b;
    }
}
