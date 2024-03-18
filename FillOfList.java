// 📌 Заполнить список десятью случайными числами.
// 📌 Отсортировать список методом sort() класса Collections и вывести его на
// экран.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class FillOfList {
    public static void main(String[] args) {
        ArrayList<Integer> array = getRandomNum();

        Collections.sort(array);
        System.out.println(array);
    }

    private static ArrayList<Integer> getRandomNum() {
        ArrayList<Integer> array = new ArrayList<>(10);
        int size = 10;
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array.add(random.nextInt(1,100));

            
        }
        System.out.println(array);
        return array;
    }


}
