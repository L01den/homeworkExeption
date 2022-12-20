package Task1;

//        Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//        и возвращающий новый массив, каждый элемент которого равен частному элементов двух
//        входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
//        Важно: При выполнении метода единственное исключение, которое
//        пользователь может увидеть - RuntimeException, т.е. ваше.

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {
        int[] arr1 = {9, 8, 7};
        int[] arr2 = {1, 2};

        System.out.println(Arrays.toString(divArrays(arr1, arr2)));

    }

    public static int[] divArrays(int[] arr1, int[] arr2) {

        if (arr1.length != arr2.length) {
            throw new RuntimeException("Нельзя совершить операцию, разная длинна массивов");
        } else {
            int[] result = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                result[i] = arr1[i] / arr2[i];
            }
            return result;
        }
    }
}



