package Task2;

public class Task2 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3};
        try {
            int d = 0;
            double catchedRes1 = intArray[1] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
