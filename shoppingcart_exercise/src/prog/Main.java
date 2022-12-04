package prog;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;

import cart.Item;

public class Main {
  public static void main(String[] args){

    //Initialize Console
    Console cons = System.console();

    List<Item> shoppingCart = new LinkedList<>();
    String input = "";
    System.out.println("Welcome to your shopping cart. Please specify Item Name, Item Quantity and Item Price in order.");

    while(!input.equals("exit")){
      input = cons.readLine("> ");
      String[] inputSplit = input.split(" ");

      switch(inputSplit[0]){
        case "list":
        if(shoppingCart.size()<=0){
          System.out.println("Your cart is empty.");
        }else{
          //list items from shoppingCart
          // shoppingCart.forEach(cartItem ->{
          //   System.out.printf("%s | %d | %f\n",cartItem.getName(),cartItem.getQuantity(),cartItem.getPrice());
          // });
          for(int i=0;i<shoppingCart.size();i++){
            Item cartItem = shoppingCart.get(i);
            System.out.printf("%d: %s | %d | %f\n",i+1,cartItem.getName(),cartItem.getQuantity(),cartItem.getPrice());
          }
        }break;
        case "add":
        if(inputSplit.length<=1){
          System.out.println("Please specify an item to add.");
        }else{
          //add to shoppingCart
          String itemName = inputSplit[1];
          Integer itemQty = Integer.parseInt(inputSplit[2]);
          Float itemPrice = Float.parseFloat(inputSplit[3]);
          Item newItem = new Item(itemName,itemQty,itemPrice);

          shoppingCart.add(newItem);
          System.out.printf("%d %s(s) added to your cart\n",itemQty,itemName);
        }break;
        case "delete":
        if (inputSplit.length<=1){
          System.out.println("Please specify an index.");
        }else{
          Integer index = Integer.parseInt(inputSplit[1]);
          if(index<=0 || index>shoppingCart.size()){
            System.out.println("Please enter a valid index.");
          }else{
          System.out.printf("%s removed from cart.\n",shoppingCart.get(index-1).getName());
          shoppingCart.remove(index-1);
          }
        }break;
        case "total":
        Float totalCost =0.0f;
        for(int i=0;i<shoppingCart.size();i++){
          Item cartItem = shoppingCart.get(i);
          totalCost += cartItem.getQuantity()*cartItem.getPrice();
        }
        System.out.printf("The total cost of items is $%f\n",totalCost);
        break;
        default:
        System.err.println("Incorrect command.");
      }

    }
  }
}
