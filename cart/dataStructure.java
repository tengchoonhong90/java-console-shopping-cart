package cart;

import java.util.*;

public class dataStructure {
    public static void main(String[] args) {
        System.out.println("Data Structure");
        List<Integer> intList = new LinkedList<Integer>();

        intList.add(Integer.parseInt("12"));
        intList.add(10);
        intList.add(20);
        System.out.println(intList);
        intList.add(1, 50);
        System.out.println(intList);

        for (int i = 0; i <intList.size(); i++) {
            System.out.printf("Index: %d , Value: %d\n", i, intList.get(i));
        }
    }
}