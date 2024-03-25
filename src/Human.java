package github.src;

import java.util.ArrayList;

abstract class Human {
  private ItemContainer inventory;
  private ArrayList<Effect> effects;
  private Room position;

  public boolean pickUpItem(Item item){}
  public boolean dropItem(Item item){}
  public boolean dropAllItems(){}
  public boolean affected(Effect effect){}
  public boolean move(Door door){}
  public boolean selectItem(){}
}
