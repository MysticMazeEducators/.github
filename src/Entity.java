package github.src;

abstract class Entity{
  private int id;
  private String description;

  public boolean applyEffect(Effect effect){}
  public boolean create(){}
  public boolean delete(){}
}