package decorator_pattern.bad2;

public class DarkRoast extends Beverage {

  private int darkBean = 1000;

  @Override
  int cost() {
    return super.cost() + darkBean;
  }

  public DarkRoast(int darkBean) {
    this.darkBean = darkBean;
    this.description="다크빈입니다.";
  }
}
