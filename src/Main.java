public class Main {
    public static void main(String[] args) {
        FahrenheitTemperatureConverter fahrenheitConverter = new FahrenheitTemperatureConverter();
        double temperatureInFahrenheit = 98.6;

        CelsiusTemperatureInterface adaptedTemperature = new FahrenheitToCelsiusAdapter(fahrenheitConverter, temperatureInFahrenheit);

        System.out.println("Temperature in Celsius: " + adaptedTemperature.getTemperatureInCelsius());
    }
}