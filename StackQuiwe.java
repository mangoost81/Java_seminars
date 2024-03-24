// 1) Написать метод, который принимает массив элементов, помещает их в стэк
// и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в
// очередь и выводит на консоль содержимое очереди.

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQuiwe {
    public static void main(String[] args) {
        int[] nums = { 2, 45, 654, 432, 2, 7, 5, 223, 90, 878, 56 };
        Stack<Integer> st = stack(nums);
        printStack(st);
        System.out.println();
        Queue<Integer> q = queue(nums);
        printquewe(q);

    }

    private static void printquewe(Queue<Integer> q) {
        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
    }

    private static void printStack(Stack<Integer> st) {
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }

    public static Stack<Integer> stack(int[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int elem : args) {
            stack.push(elem);
        }
        return stack;

    }

    public static Queue<Integer> queue(int[] args) {
        Queue<Integer> qu = new LinkedList<>();
        for (int integer : args) {
            qu.add(integer);
        }
        return qu;
    }
}
