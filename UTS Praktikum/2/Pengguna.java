public class Pengguna {
    private String username;
    private String password;

    public Pengguna(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void lihatBuku() {
        System.out.println("Melihat daftar buku.");
    }

    @Override
    public String toString() {
        return "Pengguna{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
