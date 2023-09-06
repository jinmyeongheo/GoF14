package strategy_pattern.good;

public abstract class Duck {
  FlyBehavior flyBehavior;

  public void swim(){
    System.out.println("수영해요~");
  }

  public abstract void display();

  public void performFly(){
    flyBehavior.fly();
  }
}
