package cart;

import java.util.*;
import java.io.Console;

public class shoppingCart {
    public static void main(String[] args){
        List<String> cart = new LinkedList<String>();
        Console cons = System.console();
        String input;
        int delIndex;
        boolean stop= false;

        System.out.println(("Welcome to your Shopping Cart!"));
        System.out.println(("=============================="));
        System.out.println(("Enter Command:"));
        System.out.println(("1. List"));
        System.out.println(("2. Add <Item>"));
        System.out.println(("3. Delete <Index>"));
        System.out.println(("4. Exit"));

        // main loop
        while(!stop){
            input = cons.readLine("> ");
            System.out.printf("READ: %s\n", input);
            String[] terms = input.split(" ");
            String cmd = terms[0];
            
            switch(cmd){
                case "add":
                    String fruitsStr = terms[1];
                    String fruitsReplaced = fruitsStr.replace(",", " ");
                    String[] fruits = fruitsReplaced.split(" ");
            
                    for(int i=0; i < fruits.length; i++){
                        boolean found = false;
                        for(int j=0; j <cart.size(); j++){
                            if(fruits[i].toUpperCase().equals(cart.get(j).toUpperCase())){
                                found = true ;
                                break;
                            }
                        }
                        if(!found){
                            cart.add(fruits[i]);
                            System.out.printf("Added %s to cart\n", fruits[i]);
                        }
                    }
                    break;
                case "list":
                    if(cart.size()> 0){
                        for(int i=0; i < cart.size(); i++){
                            System.out.printf("%d. %s\n", (i+1), cart.get(i));
                        }
                    }else{
                        System.out.println("Your cart is empty!");
                    }
                    break;
                case "del":
                    if (terms.length < 2){
                        System.out.println("Please provide an index in order to delete");
                    }else{
                        try{
                            delIndex = Integer.parseInt(terms[1]) - 1;
                            System.out.println(delIndex);
                            if(delIndex >= 0 && delIndex < cart.size()){
                                System.out.printf("Deleted %s from cart\n", cart.get(delIndex));
                                cart.remove(delIndex);
                            }else{
                                showNoSuchItemToDel();
                            }
                        }catch(NumberFormatException e){
                            showNoSuchItemToDel();
                        }
                        
                    }
                    break;
                case "exit":
                    stop= true;
                    break;
                default:
                    System.out.println("Invalid Command");
            }
        }
        System.out.println("Thank you for shopping with us");
    }

    private static void showNoSuchItemToDel(){
        System.out.println("No such item to delete");
    }
}