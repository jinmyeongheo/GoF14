package strategy_pattern.good;

public class FlyWithHead implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("머리로 난다.");
  }
}
