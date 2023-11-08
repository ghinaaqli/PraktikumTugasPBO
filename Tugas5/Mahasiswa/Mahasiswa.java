public class Mahasiswa {
    private String NPM;
    private String Nama;
    private double NilaiKehadiran;
    private double NilaiTugas;
    private double NilaiUTS;
    private double NilaiUAS;

    public Mahasiswa(String NPM, String Nama, double NilaiKehadiran, double NilaiTugas, double NilaiUTS, double NilaiUAS) {
        this.NPM = NPM;
        this.Nama = Nama;
        this.NilaiKehadiran = NilaiKehadiran;
        this.NilaiTugas = NilaiTugas;
        this.NilaiUTS = NilaiUTS;
        this.NilaiUAS = NilaiUAS;
    }

    public void tampilkanInformasi() {
        double NilaiAkhir = (0.1 * NilaiKehadiran) + (0.2 * NilaiTugas) + (0.3 * NilaiUTS) + (0.4 * NilaiUAS);

        String Grade, Keterangan;

        if (NilaiAkhir >= 76 && NilaiAkhir <= 100) {
            Grade = "A";
            Keterangan = "ISTIMEWA";
        } else if (NilaiAkhir >= 66 && NilaiAkhir <= 75) {
            Grade = "B";
            Keterangan = "BAIK";
        } else if (NilaiAkhir >= 56 && NilaiAkhir <= 65) {
            Grade = "C";
            Keterangan = "CUKUP";
        } else if (NilaiAkhir >= 46 && NilaiAkhir <= 55) {
            Grade = "D";
            Keterangan = "KURANG";
        } else {
            Grade = "E";
            Keterangan = "KURANG SEKALI";
        }

        System.out.println("NPM Mahasiswa: " + NPM);
        System.out.println("Nama Mahasiswa: " + Nama);
        System.out.println("Nilai Rata-rata: " + NilaiAkhir);
        System.out.println("Grade: " + Grade);
        System.out.println("Keterangan: " + Keterangan);
    }
}
