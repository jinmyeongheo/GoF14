package command_pattern.simple1;

public class SimpleRemoteController1 {
  Command1 slot;

  public SimpleRemoteController1() {
  }

  public void setCommand(Command1 command){
    this.slot = command;
  }

  public void buttonWasPressed(){
    this.slot.execute();
  }
}
