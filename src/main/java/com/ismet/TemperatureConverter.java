package com.ismet;


public class TemperatureConverter {

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        // Example usage
        double fahrenheit = 98.6;
        double celsius = converter.fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " Fahrenheit is " + celsius + " Celsius");

        double kelvin = 300;
        double celsiusFromKelvin = kelvinToCel(kelvin);
        System.out.println(kelvin + " Kelvin is " + celsiusFromKelvin + " Celsius");
    }
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public boolean isExtremeTemperature(double celsius) {
        return celsius < -40 || celsius > 50;
    }

    public static double kelvinToCel(double kel){
        return (kel - 273.15);
    }

    public static double kelvinToFah(double kel) {
        return Math.round((kel-273.15)* ((double) 9 /5) + 32);
    }
}
