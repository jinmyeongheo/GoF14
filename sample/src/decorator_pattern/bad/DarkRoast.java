package decorator_pattern.bad;

public class DarkRoast extends Beverage{

  private int darkBean = 1000;



  @Override
  int cost() {
    return darkBean;
  }

  public DarkRoast(int darkBean) {
    super.description ="fhfhfh";
    this.darkBean = darkBean;
  }
}
