package prog;

import cart.Apple;
import cart.Item;
import cart.Orange;

public class Main {
  public static void main(String [] args){
    // Item apple = new Item("Apple","appl");
    // Item orange = new Item("Orange", "orng");

    Item apple = new Apple(); 
    //item is of Item type, thus cannot access Apple methods even though it is an Apple object. Needs to be casted as Apple type to access Apple methods.
    Item orange = new Orange();
    Item item = apple;

    apple.setPrice(.5f);
    apple.setQuantity(10);

    Apple apple2 = (Apple)apple;
    apple2.setType("Fuji");

    orange.setPrice(.5f);
    orange.setQuantity(10);

    System.out.printf("Apple Code: %s\n", apple.getCode());
    System.out.printf("Orange Code: %s\n", orange.getCode());

    Apple washington = (Apple)item;
    System.out.printf("washington code: %s\n",washington.getCode());
    // test whether item is Apple class or Orange class
    System.out.printf("is item an Orange? %b\n", item instanceof Orange);
    if(item instanceof Orange){
      orange = (Orange)item;
    }
    
  }
}
