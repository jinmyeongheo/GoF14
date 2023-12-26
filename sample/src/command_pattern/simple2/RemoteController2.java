package command_pattern.simple2;

import command_pattern.simple1.Command1;

public class RemoteController2 {
  Command1[] onCommands;
  Command1[] offCommands;

  public RemoteController2() {
    onCommands = new Command1[7];
    offCommands = new Command1[7];
  }

  public void setCommand(int slot, Command1 onCommand, Command1 offCommand){
    this.onCommands[slot] = onCommand;
    this.offCommands[slot] = offCommand;
  }

  public void onButtonWasPressed(int slot){
    this.onCommands[slot].execute(); // 커맨드안에 어떤리시버가 실행될지 아무것도 모름.
  }

  public void offButtonWasPressed(int slot){
    this.offCommands[slot].execute();
  }

}
