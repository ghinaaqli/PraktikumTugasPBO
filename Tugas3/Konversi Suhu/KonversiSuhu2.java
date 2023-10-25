public class KonversiSuhu2 extends KonversiSuhu {
    public static double fahrenheitToReamur(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        double reamur = celsius * 4 / 5;
        return reamur;
    }
}