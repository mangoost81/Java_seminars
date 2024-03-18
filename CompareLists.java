// 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.

// 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.

import java.util.ArrayList;
import java.util.LinkedList;

public class CompareLists {
    public static void main(String[] args) {
        int size = 100_000;

        System.out.println("Добавляем элементы в конец списка ");

        long start = System.currentTimeMillis();
        arrayListAddLast(size);
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        linkedListAddLast(size);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println("Добавляем элементы в начало списка ");

        start = System.currentTimeMillis();
        arrayListAddFirst(size);
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        linkedListAddFirst(size);
        System.out.println(System.currentTimeMillis() - start);

        System.out.println("Добавляем элементы в середину списка ");

        start = System.currentTimeMillis();
        arrayListAddMiddle(size);
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        linkedListAddMiddle(size);
        System.out.println(System.currentTimeMillis() - start);
    }

    public static ArrayList<Integer> arrayListAddLast(int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.addLast(i);

        }
        return arrayList;
    }


    public static LinkedList<Integer> linkedListAddLast(int size) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            linkedList.addLast(i);

        }
        return linkedList;
    }

    public static ArrayList<Integer> arrayListAddFirst(int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.addFirst(i);

        }
        return arrayList;
    }


    public static LinkedList<Integer> linkedListAddFirst(int size) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            linkedList.addFirst(i);

        }
        return linkedList;
    }

    public static ArrayList<Integer> arrayListAddMiddle(int size) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.add(arrayList.size()/2, i);

        }
        return arrayList;
    }


    public static LinkedList<Integer> linkedListAddMiddle(int size) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            linkedList.add(linkedList.size()/2, i);

        }
        return linkedList;
    }
}   



