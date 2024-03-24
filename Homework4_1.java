import java.util.LinkedList;

public class Homework4_1 {
    public static void main(String[] args) {
        LinkedList<Object> linll = new LinkedList<>();
        fillLinkedlist(linll);
        System.out.println();
        
        for (Object object : linll) {
            System.out.print(object + " ");
        }
        
    }

    private static void fillLinkedlist(LinkedList<Object> linll) {
        linll.add(1);
        linll.add("One");
        linll.add(2);
        linll.add("Two");
        for (Object object : linll) {
            System.out.print(object + " ");
        }
    }

    public static void reverse(LinkedList<Object> ll) {
        LinkedList<Object> revList = new LinkedList<>();
        for (int i = ll.size()-1; i >= 0; i--) {
            revList.add(ll.get(i));
            //Object a = ll.get(i);
            // revList.add(a);
            //System.out.println(i);
        }
        for (Object object : revList) {
            System.out.print(object + " ");
        }
       
    }
}
