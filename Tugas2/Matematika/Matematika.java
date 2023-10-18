public class Matematika {
    public int pertambahan(int a, int b) {
        return a + b;
    }

    public int pengurangan(int a, int b) {
        return a - b;
    }

    public int perkalian(int a, int b) {
        return a * b;
    }

    public double pembagian(int a, int b) {
        if (b == 0) {
            System.out.println("Pembagian oleh nol tidak diizinkan.");
            return Double.NaN;
        }
        return (double) a / b;
    }
}