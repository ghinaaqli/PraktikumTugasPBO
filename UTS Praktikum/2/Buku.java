import java.util.ArrayList;

public class Buku {
    private String genre;
    private ArrayList<String> daftarJudul;

    public Buku(String genre) {
        this.genre = genre;
        this.daftarJudul = new ArrayList<>();
    }

    public String getGenre() {
        return genre;
    }

    public void tambahJudul(String judul) {
        daftarJudul.add(judul);
    }

    public void hapusJudul(String judul) {
        daftarJudul.remove(judul);
    }

    public void lihatDaftarJudul() {
        System.out.println("Daftar Buku Genre " + genre + ":");
        for (String judul : daftarJudul) {
            System.out.println("- " + judul);
        }
    }
}
