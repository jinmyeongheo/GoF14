package observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

  private List<Observer> observers;
  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData() {
    this.observers = new ArrayList<Observer>();
  }

  @Override
  public void registerObserver(Observer o) {
    this.observers.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    this.observers.remove(o);
  }

  @Override
  public void notifyObservers() { // 오벚버들에게 상태변화를 알림.
    for (Observer observer :
        this.observers) {
      observer.update(this.temperature, this.humidity, this.pressure);
    }
  }

  public void measurementsChanged(){ // 가상스테이션으로 부터 갱신된 측정값을 받으면 옵저버들에게 알린다.
    this.notifyObservers();
  }

  public void checkMeasurement(float temp, float humidity, float pressure){
    this.temperature = temp;
    this.humidity = humidity;
    this.pressure = pressure;
  };
}
