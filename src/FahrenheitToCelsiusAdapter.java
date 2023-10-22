class FahrenheitToCelsiusAdapter implements CelsiusTemperatureInterface {
    private FahrenheitTemperatureConverter fahrenheitConverter;
    private double temperatureInFahrenheit;

    public FahrenheitToCelsiusAdapter(FahrenheitTemperatureConverter converter, double temperatureInFahrenheit) {
        this.fahrenheitConverter = converter;
        this.temperatureInFahrenheit = temperatureInFahrenheit;
    }

    @Override
    public double getTemperatureInCelsius() {
        return fahrenheitConverter.convertFtoC(temperatureInFahrenheit);
    }
}
