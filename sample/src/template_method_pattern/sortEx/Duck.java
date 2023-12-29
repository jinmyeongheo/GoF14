package template_method_pattern.sortEx;

public class Duck implements Comparable<Duck> {
  String name;
  int weight;

  public Duck(String name, int weight) {
    this.name = name;
    this.weight = weight;
  }

  @Override
  public int compareTo(Duck otherDuck) { // compareTo 구현강제
    //💖 sort()메서드템플릿에서 사용되는 compareTo()를 재정의 한다.
    if(this.weight < otherDuck.weight){
      return -1;
    }
    else if(this.weight == otherDuck.weight){
      return 0;
    }
    else {
      return 1;
    }
  }
}
