public class Pembelian {
    private double totalPembelian;
    private double potongan;
    private double jumlahDibayarkan;

    public Pembelian(double totalPembelian) {
        this.totalPembelian = totalPembelian;
        hitungPotongan();
    }

    private void hitungPotongan() {
        if (totalPembelian < 50000) {
            potongan = 0.05 * totalPembelian;
        } else {
            potongan = 0.20 * totalPembelian;
        }
        jumlahDibayarkan = totalPembelian - potongan;
    }

    public void tampilkanInfoPembelian() {
        System.out.println("Besarnya potongan Rp. " + potongan);
        System.out.println("Jumlah yang harus dibayarkan Rp. " + jumlahDibayarkan);
    }
}