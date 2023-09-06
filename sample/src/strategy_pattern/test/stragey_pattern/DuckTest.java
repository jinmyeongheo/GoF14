package strategy_pattern.test.stragey_pattern;

import org.junit.jupiter.api.Test;
import strategy_pattern.good.FlyWithHead;
import strategy_pattern.good.FlyWithTail;
import strategy_pattern.good.RedDuck;

class DuckTest {

  @Test
  void performFly() {

    FlyWithHead flyWithHead = new FlyWithHead();
    RedDuck redDuck = new RedDuck(flyWithHead);

    redDuck.display();
    redDuck.swim();
    redDuck.performFly();

    System.out.println(" ======================== " );
    FlyWithTail flyWithTail = new FlyWithTail();
    redDuck = new RedDuck(flyWithTail);
    redDuck.display();
    redDuck.swim();
    redDuck.performFly();
  }
}