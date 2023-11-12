import java.util.Scanner;

public class MainPerpustakaan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan username Admin: ");
        String adminUsername = scanner.nextLine();
        System.out.print("Masukkan password Admin: ");
        String adminPassword = scanner.nextLine();

        Admin admin = new Admin(adminUsername, adminPassword);

        System.out.println("\nSelamat datang, " + adminUsername + "!");

        System.out.println("\nMasukkan detail buku yang akan ditambahkan:");
        System.out.print("Genre: ");
        String genre = scanner.nextLine();
        System.out.print("Judul: ");
        String judul = scanner.nextLine();
        admin.tambahBuku(genre, judul);

        System.out.print("\nMasukkan username User: ");
        String userUsername = scanner.nextLine();
        System.out.print("Masukkan password User: ");
        String userPassword = scanner.nextLine();

        User user = new User(userUsername, userPassword);

        System.out.println("\nSelamat datang, " + userUsername + "!");

        System.out.println("\n" + userUsername + ", berikut daftar buku yang tersedia:");
        user.lihatBuku();

        scanner.close();
    }
}
