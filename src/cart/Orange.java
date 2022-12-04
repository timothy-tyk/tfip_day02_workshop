package cart;

public class Orange extends Item{
  private String type;

  public Orange(){
    super("Orange", "orng");
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

}
