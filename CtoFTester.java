//celsiustoFahrenheit should have double celsius as parameter
//fahrenheitToCelsius should have double fahrenheit as parameter
// both functions should return double


class CtoFTester.java {
    public double celsiustoFahrenheit(double celsius) {
      double fahrenheit = (celsius * 1.8) + 32;
      return fahrenheit;
    }
    System.out.print (celsiustoFahrenheit(0));
    public double fahrenheitToCelsius(double fahrenheit) {
      double celsius = ((fahrenheit - 32)/1.8);
      return celsius;
    }
    System.out.print (celsiustoFahrenheit(100));
}
