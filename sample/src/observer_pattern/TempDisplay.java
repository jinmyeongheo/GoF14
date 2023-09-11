package observer_pattern;

public class TempDisplay implements Observer, DisplayElement{
  private float temperature;

  private WeatherData weatherData;

  public TempDisplay(WeatherData weatherData) { // 생성과 동시에 옵저버에 등록!
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void display() {
    System.out.println("현대 온도 = " + temperature);
  }

  @Override
  public void update(float temp, float humidity, float pressure) {
    this.temperature = temp;
  }
}
