public class BilanganGanjilGenap {
    public static void main(String[] args) {
        System.out.println("Deret Bilangan Ganjil dan Genap:");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " adalah bilangan genap");
            } else {
                System.out.println(i + " adalah bilangan ganjil");
            }
        }
    }
}
