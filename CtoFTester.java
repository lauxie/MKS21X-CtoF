//celsiustoFahrenheit should have double celsius as parameter
//fahrenheitToCelsius should have double fahrenheit as parameter
// both functions should return double


public class CtoFTester {
    public static double celsiustoFahrenheit(double celsius) {
      double fahrenheit = (celsius * 1.8) + 32;
      return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
      double celsius = ((fahrenheit - 32)/1.8);
      return celsius;
    }
    public static void main (String[] args) {
      System.out.println(celsiustoFahrenheit(0));
      System.out.println(fahrenheitToCelsius(32));
    }
}
