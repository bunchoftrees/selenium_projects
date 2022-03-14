import java.util.ArrayList;
import java.util.Arrays;

public class CoreJavaConditionals {
    public static void main(String[] args) {
        int[] myArr= {1, 2, 3, 5, 8, 13, 21, 34, 55, 89};

        System.out.println("This program prints out even values from an array myArr");

        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] % 2 == 0) {
                System.out.printf("myArr[%s]: %s\n", i, myArr[i]);
            } else {
                System.out.printf("The number in myArr[%s] is odd\n", i);
            }
        }

        var myArrList = new ArrayList<>(Arrays.asList("forrest", "alix", "lexie", "andi", "hunter", "shlomo"));

        for (Object i : myArrList) {
            System.out.printf("Name: %s\n", i);
        }
    }
}
