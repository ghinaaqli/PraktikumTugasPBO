public class Main {
    public static void main(String[] args) {
        BentukTigaDimensi bentuk1 = new Balok(5, 3, 4);
        BentukTigaDimensi bentuk2 = new Kubus(5);

        System.out.println("Balok:");
        System.out.println("Volume: " + bentuk1.hitungVolume());
        System.out.println("Luas Permukaan: " + bentuk1.hitungLuasPermukaan());

        System.out.println("\nKubus:");
        System.out.println("Volume: " + bentuk2.hitungVolume());
        System.out.println("Luas Permukaan: " + bentuk2.hitungLuasPermukaan());
    }
}