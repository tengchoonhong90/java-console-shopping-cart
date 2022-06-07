package cart;

import java.io.Console;

// import java.io.Console;;

public class shoppingCart {
    public static void main(String[] args) {
        Console cons = System.console();
        System.out.println(("Welcome to your Shopping Cart!"));
        System.out.println(("=============================="));
        System.out.println(("1. List"));
        System.out.println(("2. Add"));
        System.out.println(("3. Delete"));
        String command = cons.readLine("").trim();
        System.out.printf("%s\n", command);

    }
} 