package command_pattern.simple1;

public class LightOnCommand1 implements Command1{
  Light1 light; // 리시버

  public LightOnCommand1(Light1 light) { // 이 커맨드로 무엇(어떤조명)을 제어할지 전달됨.
    this.light = light;
  }

  @Override
  public void execute() { //excute가 실행되면 receiver가 적절한 행동을 취함 ex) 불켜기
    light.on();
  }
}
