// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        hashMapFill();
        String[] str = {"a+(d*3)", "[a+(1*3)", "[6+(3*3)]", "{a}[+]{(d*3)}", "<{a}+{(d*3)}>",
    "{a+]}{(d*3)}"};
        for (String string : str) {
            System.out.println(string + " -->" + isCorrectBrackets(string));
        }
    }

    public static Map<Character, Character> hashMapFill() {
        Map <Character, Character> chs = new HashMap<>(); {
            chs.put(')', '(');
            chs.put('}', '{');
            chs.put(']', '[');
            chs.put('>', '<');

            return chs;
            
        }
    }

    public static Boolean isCorrectBrackets(String str) {
        Map<Character, Character> chs = hashMapFill();
        Stack<Character> stack = new Stack<>();
        for (char character : str.toCharArray()) {
            if (chs.containsValue(character)) {
                stack.push(character);
            }
            else if (chs.containsKey(character)) {
                if (stack.isEmpty() || stack.pop() != chs.get(character)) {
                    return false;
                }

            }
        }
        return stack.isEmpty();

    }
}
