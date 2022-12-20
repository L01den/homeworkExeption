package Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        inputString();
    }

    public static void inputString() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Напишите");
        String myStr = sc.nextLine();
        if (myStr == null || myStr.isEmpty() || myStr.equals(" ")) {
            try {
                throw new Exception("You entered an empty string!!!");
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(2);
            }
        } else {
            System.out.println("Вы написали " + myStr);
        }


//            try {
//                String myStr = sc.nextLine();
//                System.out.println("Вы написали " + myStr);
//                done = true;
//            } catch (InputMismatchException e) {
//                System.out.println("Вы ввели не дробное число");
//            }
    }
}

