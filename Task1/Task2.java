package Task1;

//        Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//        каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
//        Если длины массивов не равны, необходимо как-то оповестить пользователя.

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr1 = {9, 8, 7};
        int[] arr2 = {1, 2};

        System.out.println(Arrays.toString(diffArrays(arr1, arr2)));

    }

    public static int[] diffArrays(int[] arr1, int[] arr2) {

        if (arr1.length != arr2.length) {
            System.out.println("Нельзя посчитать разность массовов разной длинны");
        } else {
            int[] result = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                result[i] = arr1[i] - arr2[i];
            }
            return result;
        }
        return null;
    }
}
