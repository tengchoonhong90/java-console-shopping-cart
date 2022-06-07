package cart;

public class array {
    public static void main(String[] args) {
        // System.out.println("Array");
        // for(int idx = 0; idx < args.length; idx++) {
        //     System.out.printf("%d: %s\n", idx+1, args[idx]);

        // }

        for (String val : args) {
            System.out.printf("value = %s\n", val);
        }
    }
}