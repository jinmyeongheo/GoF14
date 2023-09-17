package decorator_pattern.bad2;

public class DarkRoastWithSteamedMilk extends Beverage {

  private int darkBean = 1000;
  private int steamedMilk = 500;
  @Override
  int cost() {
    return super.cost() + darkBean + steamedMilk;
  }

  public DarkRoastWithSteamedMilk(int darkBean) {
    this.darkBean = darkBean;
    this.description="다크빈입니다.";
  }
}
