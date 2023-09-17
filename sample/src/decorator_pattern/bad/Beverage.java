package decorator_pattern.bad;

import lombok.Getter;

@Getter
public abstract class Beverage {
  public String description;

  abstract int cost();

}
