public class IMT {
    public static double hitungIMT(double berat, double tinggi) {
        double tinggiMeter = tinggi / 100;
        return berat / (tinggiMeter * tinggiMeter);
    }

    public static String tentukanKategoriIMT(double imt) {
        if (imt < 18.5) {
            return "Berat Badan Kurang";
        } else if (imt >= 18.5 && imt <= 24.9) {
            return "Berat Badan Ideal";
        } else if (imt >= 25 && imt <= 29.9) {
            return "Berat Badan Lebih";
        } else if (imt >= 30 && imt <= 39.9) {
            return "Gemuk";
        } else {
            return "Sangat Gemuk";
        }
    }
}
