package observer_pattern;

public class MultiDisplay implements Observer, DisplayElement{
  private float temperature;
  private float humidity;
  private float pressure;
  private WeatherData weatherData;

  public MultiDisplay(WeatherData weatherData) { // 생성과 동시에 옵저버에 등록!
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void display() {
    System.out.println("현대 온도 = " + temperature);
    System.out.println("현대 습도 = " + temperature);
    System.out.println("현대 기압 = " + temperature);
  }

  @Override
  public void update(float temp, float humidity, float pressure) {
    this.temperature = temp;
    this.humidity = humidity;
    this.pressure = pressure;
  }
}
