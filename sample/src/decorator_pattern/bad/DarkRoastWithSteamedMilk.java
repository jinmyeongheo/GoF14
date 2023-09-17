package decorator_pattern.bad;

public class DarkRoastWithSteamedMilk extends Beverage {

  private int darkBean = 1000;
  private int steamedMilk = 500;

  @Override
  int cost() {
    return darkBean + steamedMilk;
  }
}
