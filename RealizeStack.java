// Реализовать стэк с помощью массива.
// Нужно реализовать методы:
// size(), empty(), push(), peek(), pop().

public class RealizeStack {
    static int capacity;
    static int[] nums;
    static int topindex;

    public static void main(String[] args) {
        capacity = 5;
        nums = new int[capacity];
        topindex = -1;
        System.out.println(size()); //0
        System.out.println(empty()); //True
        push(3); //
        push(32);
        push(234);
        push(534);
        System.out.println(empty()); //False
        System.out.println(size()); // 4
        System.out.println(pop()); // 534
        System.out.println(size()); //4
        System.out.println(peek()); //234
    }

    public static int size() {
        return topindex + 1;
    }

    public static boolean empty() {
        return topindex == -1;
    }

    public static void push(int num) {
        nums[++topindex] = num;
    }

    public static int peek() {
        return nums[topindex];
    }

    public static int pop() {
        return nums[topindex--];
    }

}
