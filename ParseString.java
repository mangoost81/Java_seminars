// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя строку вида
// text~num
// 2. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// 3. Если введено print~num, выводит строку из позиции num в связном
// списке и удаляет её из списка.

import java.util.LinkedList;
import java.util.Scanner;

public class ParseString {
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите строку типа text~num для добавления в список ");
            System.out.println("print~num для вывода строки и ее удаления ");
            System.out.println("Введите quit для выхода из программы ");
            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;

            }
            String[] inputSplit = input.split("~");
            String text = inputSplit[0];
            int num = Integer.parseInt(inputSplit[1]);
            if (text.equals("print")) {
                if (num >= 0 && num <= linkedlist.size()) {
                    System.out.println(linkedlist.remove(num));

                    System.out.println();
                } else {
                    System.out.println("Неккоректный ввод индекса ");
                }
                System.out.println(linkedlist);

            } else {
                if (num >= 0 && num <= linkedlist.size()) {
                    linkedlist.add(num, text);
                } else {
                    System.out.println("Неккоректный ввод индекса ");
                }
                
                System.out.println(linkedlist);
            }

        }

    }
}
