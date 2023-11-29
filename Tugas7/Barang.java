class Barang {
    String kode;
    String nama;
    int harga;
    int jumlahBeli;
    int jumlahBayar;

    public Barang(String kode, String nama, int harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
    }

    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
        this.jumlahBayar = harga * jumlahBeli;
    }
}