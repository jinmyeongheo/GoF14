package decorator_pattern.bad2.test;

import static org.junit.jupiter.api.Assertions.*;

import decorator_pattern.bad2.DarkRoast;
import org.junit.jupiter.api.Test;

class DarkRoastTest {

  @Test
  void test(){
    DarkRoast darkRoast = new DarkRoast(20);
    System.out.println("darkRoast = " + darkRoast);

  }

}