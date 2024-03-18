// Дан произвольный массив целых чисел. Создайте список ArrayList,
//  заполненный данными из этого массива. Необходимо удалить из списка четные 
//  числа и вернуть результирующий.

// Напишите свой код в методе removeEvenNumbers класса Answer. 
// Метод removeEvenNumbers принимает на вход один параметр: Integer[] arr - список целых чисел, 
// возвращает список ArrayList<Integer>

import java.util.ArrayList;

public class homework3_2 {
    public static void main(String[] args) {
       Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
       removeEvenNumbers(arr);
    }

    public static void removeEvenNumbers(Integer[] arr) {
        ArrayList<Integer> lst = new ArrayList<Integer>(arr.length);
        for (Integer integer : arr) {
            if(integer % 2 !=0){

            
            lst.add(integer);
            }
        }
        System.out.println(lst);
    }

}
