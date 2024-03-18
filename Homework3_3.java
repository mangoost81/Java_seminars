// Реализуйте метод, который принимает на вход целочисленный массив arr:
// - Создаёт список ArrayList, заполненный числами из исходого массива arr.
// - Сортирует список по возрастанию и выводит на экран.
// - Находит минимальное значение в списке и выводит на экран - Minimum is {число} - 
// Находит максимальное значение в списке и выводит на экран - Maximum is {число}
// - Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
// Напишите свой код в методе analyzeNumbers класса Answer. 
// Метод analyzeNumbers принимает на вход один параметр:

// Integer[] arr - массив целых чисел.


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Homework3_3 {
    public static void main(String[] args) {
       Integer[] arr = new Integer[]{4, 2, 7, 5, 1, 3,12, 8, 6, 9};
       analyzeNumbers(arr);
    }
    public static void analyzeNumbers(Integer[] array) {
        List <Integer> lst = Arrays.asList(array);
        // System.out.println(lst);
        // System.out.println(lst.get(3));
        Collections.sort(lst);
        System.out.println(lst);
        System.out.println("Minimum is- " + Collections.min(lst));
        System.out.println("Maximum is- " + Collections.max(lst));
        int sum=0;
        for (Integer integer : lst) {
            sum += integer;
        }
        System.out.println((double)sum/lst.size());
        

    }
}
