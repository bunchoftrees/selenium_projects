public class CoreJavaVariables {
    public static void main(String[] args) {
        int myNum = 5;
        String myWebsite = "https://forrestbear.org";
        char myLetter = 'A';
        double myDecimal = 3.14;
        boolean myBool = true;

        System.out.printf("myNum: %s\nmyWebsite: %s\nmyLetter: %s\nmyDecimal: %s\nmyBool: %s\n",
                myNum,
                myWebsite,
                myLetter,
                myDecimal,
                myBool);

        int[] myArr = {1, 2, 3, 5, 8};

        for (int i = 0; i < myArr.length; i++) {
            System.out.printf("myArr[%s]: %s\n", i, myArr[i]);
        }
    }
}
