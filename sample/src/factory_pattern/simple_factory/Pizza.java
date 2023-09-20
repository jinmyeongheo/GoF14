package factory_pattern.simple_factory;

public abstract class Pizza {

  abstract void prepare();
  abstract void bake();
  abstract void cut();
  abstract void box();
}
