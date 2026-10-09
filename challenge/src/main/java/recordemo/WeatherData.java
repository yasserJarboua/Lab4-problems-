package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {

    // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit() {
        return (this.temperatureCelsius*9/5+32);
    }

    // Instance method to get a formatted summary string
    public String getSummary() {
        String summary=String.format("Current weather: %.2f°C (%.1f°F) and %s"
                ,this.temperatureCelsius,this.temperatureFahrenheit(),this.conditions);
        return summary;
    }

    // Static factory method to create a WeatherData record from Fahrenheit
    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
       return new WeatherData(((double) 5 /9)*(tempFahrenheit-32),conditions);
    }

    public static void main(String[] args) {
        WeatherData today=new WeatherData(25,"Sunny");
        WeatherData  yesterday = WeatherData.fromFahrenheit(50,"cloudy");
        System.out.print("Today's weather:"+today.getSummary()+"\n");
        System.out.print("Yesterday's weather:"+yesterday.getSummary());
    }
}
