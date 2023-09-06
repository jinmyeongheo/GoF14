package strategy_pattern.good;

public class FlyWithTail implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("꼬리로 난다.");
  }
}
