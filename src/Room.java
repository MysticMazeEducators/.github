import java.util.ArrayList;

package .github.src.github;

public class Room {
  private ArrayList<Door> doors;
  private ArrayList<Human> humans;
  private ArrayList<Effect> effects;
  private ItemContainer inventory;
  private int capacity;

  public boolean killAll(){}
  public boolean enter(){}
  public boolean receiveItem(Item item){}
}
