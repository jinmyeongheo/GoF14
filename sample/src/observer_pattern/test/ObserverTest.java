package observer_pattern.test;

import observer_pattern.MultiDisplay;
import observer_pattern.TempDisplay;
import observer_pattern.WeatherData;
import org.junit.jupiter.api.Test;

public class ObserverTest {

  @Test
  void test(){
    WeatherData weatherData = new WeatherData();

    TempDisplay tempDisplay = new TempDisplay(weatherData);
    MultiDisplay multiDisplay = new MultiDisplay(weatherData);

    weatherData.checkMeasurement(80,65,30);
    tempDisplay.display();
    multiDisplay.display();

    System.out.println("===============");

    weatherData.checkMeasurement(1,2,1);
    tempDisplay.display();
    multiDisplay.display();
  }
}
