public class Perpustakaan {
    public static void main(String[] args) {
        Admin admin = new Admin("Admin123", "admin_password");

        admin.tambahBuku("Novel", "Judul Novel 1");
        admin.tambahBuku("Sains", "Judul Buku Sains 1");

        User user = new User("User456", "user_password");

        user.lihatBuku();
    }
}