// 📌 Написать программу, которая запросит пользователя ввести
// <Имя> в консоли.
// 📌 Получит введенную строку и выведет в консоль сообщение
// “Привет, <Имя>!”

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        System.out.println("Name, please: ");
        
        Scanner scanner = new Scanner(System.in, "ibm866"); //Кодировка для русского вывода
        String name = scanner.nextLine();
        
        System.out.println("Hello" + "," + name);
        System.out.printf("Hello %s!", name);
        
        scanner.close();
    }
}
