package strategy_pattern.good;


import lombok.Getter;

@Getter
public class RedDuck extends Duck{

  public RedDuck(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  @Override
  public void display() {
    System.out.println("빨간오리");
  }
}
