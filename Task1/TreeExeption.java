package Task1;

//      Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class TreeExeption {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        String myStr = "123rty";

//        System.out.println(zeroDivision(2, 0));
//        System.out.println(arrayElement(arr, 7));
//        System.out.println(stringToNumber(myStr));
    }

    // Вызываю ArithmeticException
    public static int zeroDivision(int a, int b) {
        return a / b;
    }

    // Вызываю ArrayIndexOutOfBoundsException
    public static int arrayElement(int[] arr, int posirion) {
        return arr[posirion];
    }

    // Вызываю NumberFormatException
    public static int stringToNumber(String str) {
        int num = Integer.parseInt(str);
        return num;
    }
}
