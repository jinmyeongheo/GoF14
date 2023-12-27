package adapter_pattern;

public class TurkeyAdapter implements Duck{ // 감쌀 인터페이스
  Turkey turkey; // 어뎁티(실제로 실행되는 주체)

  public TurkeyAdapter(Turkey turkey) { //생성자주입
    this.turkey = turkey;
  }
  public void quack() { // 클라이언트가 Duck인터페이스 규격으로 요청해도 실제로는 Turkey가 실행됨.
    turkey.gobble();
  }
  public void fly() {
    for (int i = 0; i < 5; i++) {
      turkey.fly();
    }
  }
}
