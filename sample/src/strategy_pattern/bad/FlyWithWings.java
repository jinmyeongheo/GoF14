package strategy_pattern.bad;

import strategy_pattern.good.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("푸드덕!푸드덕!" );
  }
}
