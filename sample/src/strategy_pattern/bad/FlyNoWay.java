package strategy_pattern.bad;

import strategy_pattern.good.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("못날아유 ㅠ");
  }
}
