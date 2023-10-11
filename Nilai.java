class Nilai {
    private String nim;
    private String nama;
    private int absen;
    private int tugas;
    private int uts;
    private int uas;
  
    public Nilai(String nim, String nama, int absen, int tugas, int uts, int uas) {
      this.nim = nim;
      this.nama = nama;
      this.absen = absen;
      this.tugas = tugas;
      this.uts = uts;
      this.uas = uas;
    }
  
    public void CetakNilai() {
      System.out.println("NIM: " + nim);
      System.out.println("Nama: " + nama);
      System.out.println("Nilai Absen [10%]: " + absen);
      System.out.println("Nilai Tugas [20%]: " + tugas);
      System.out.println("Nilai UTS [30%]: " + uts);
      System.out.println("Nilai UAS [40%]: " + uas);
  
      double nilaiAkhir = (absen * 0.1 + tugas * 0.2 + uts * 0.3 + uas * 0.4);
      System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
  }