package adapter_pattern;

public class MallarDuck implements Duck{

  @Override
  public void quack() {
    System.out.println("꽥");
  }

  @Override
  public void fly() {
    System.out.println("I'm flying");
  }
}
