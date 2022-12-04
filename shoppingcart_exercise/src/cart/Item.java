package cart;

public class Item {
  private String name;
  private Integer quantity=0;
  private Float price = 0.0f;

  //Constructor
  public Item(String name, Integer quantity,Float price){
    this.name = name;
    this.quantity = quantity;
    this.price=price;
  }
  public Item(){};

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }
  
}
