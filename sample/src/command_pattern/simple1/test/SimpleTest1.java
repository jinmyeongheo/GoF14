package command_pattern.simple1.test;

import command_pattern.simple1.Light1;
import command_pattern.simple1.LightOnCommand1;
import command_pattern.simple1.SimpleRemoteController1;
import org.junit.jupiter.api.Test;

public class SimpleTest1 {
  @Test
  void test(){

    SimpleRemoteController1 remote = new SimpleRemoteController1();
    Light1 light1 = new Light1();
    LightOnCommand1 lightOnCommand1 = new LightOnCommand1(light1);

    remote.setCommand(lightOnCommand1);
    remote.buttonWasPressed();
  }
}
