import java.util.HashMap;

public class Admin extends Pengguna {
    private HashMap<String, Buku> daftarBuku;

    public Admin(String username, String password) {
        super(username, password);
        this.daftarBuku = new HashMap<>();
    }

    public void tambahBuku(String genre, String judul) {
        if (!daftarBuku.containsKey(genre)) {
            daftarBuku.put(genre, new Buku(genre));
        }

        Buku buku = daftarBuku.get(genre);
        buku.tambahJudul(judul);

        System.out.println("Menambahkan buku dengan judul: " + judul + " ke dalam genre: " + genre);
    }

    public void hapusBuku(String genre, String judul) {
        if (daftarBuku.containsKey(genre)) {
            Buku buku = daftarBuku.get(genre);
            buku.hapusJudul(judul);
            System.out.println("Menghapus buku dengan judul: " + judul + " dari genre: " + genre);
        } else {
            System.out.println("Genre " + genre + " tidak ditemukan.");
        }
    }

    public void lihatDaftarBuku() {
        System.out.println("Daftar Buku:");
        for (Buku buku : daftarBuku.values()) {
            buku.lihatDaftarJudul();
        }
    }
}