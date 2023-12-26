package command_pattern.simple2;

import command_pattern.simple1.Command1;

public class StereoOnWithCDCommand implements Command1 {
  Stereo stereo;

  @Override
  public void execute() {
    stereo.on(); // 전원키고
    stereo.setCD(); // cd 넣고
    stereo.volumeUp();// 소리키워!!
  }
}
