package decorator_pattern.bad2;

import lombok.Getter;

@Getter
public abstract class Beverage {
  public String description;
  public int milk;
  public int mocha;
  public int whip;
  int cost(){

    int sum = 0;

    if(milk != 0){
      sum += milk;
    }
    if(mocha != 0){
      sum += mocha;
    }
    if(whip != 0){
      sum += whip;
    }

    return sum;
  };

}
