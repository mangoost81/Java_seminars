// 1. Напишите метод, который заполнит массив из 1000 элементов случайными
// цифрами от 0 до 500
// 2. Создайте метод, в который передайте заполненный выше массив и с
// помощью Set вычислите процент уникальных значений в данном массиве и
// верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее
// количество чисел в массиве.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomSet {
    public static void main(String[] args) {
        // for (Integer num : randomFill(1000, 500)) {
        //     System.out.println(num);
        // }
        int[] arra = randomFill(1000, 500);
        System.out.println(getUnicPercent(arra));
        // System.out.println(randomFill(1000, 500));
    }

    public static int[] randomFill(int size, int max) {
        int[] arr = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(max + 1);
        }
        return arr;
    }

    public static Double getUnicPercent(int[] arr ) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        Double perc = set.size()*100.0/arr.length;
        return perc;
    }



}
