public class DemoKonversiSuhu {
    public static void main(String[] args) {
        
        double suhuCelcius = 25.0;
        double suhuFahrenheit = KonversiSuhu.celciusToFahrenheit(suhuCelcius);
        double suhuReamur = KonversiSuhu.celciusToReamur(suhuCelcius);
        
        System.out.println("Konversi suhu dari Celcius ke Fahrenheit:");
        System.out.println(suhuCelcius + " Celcius = " + suhuFahrenheit + " Fahrenheit");
        System.out.println();

        System.out.println("Konversi suhu dari Celcius ke Reamur:");
        System.out.println(suhuCelcius + " Celcius = " + suhuReamur + " Reamur");
        System.out.println();

        
        double suhuFahrenheit2 = 98.6;
        double suhuReamur2 = KonversiSuhu2.fahrenheitToReamur(suhuFahrenheit2);

        System.out.println("Konversi suhu dari Fahrenheit ke Reamur:");
        System.out.println(suhuFahrenheit2 + " Fahrenheit = " + suhuReamur2 + " Reamur");
    }
}
