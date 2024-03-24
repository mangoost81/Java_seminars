// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными
// и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на
// некоторую букву во втором слове, при этом
// 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением
// порядка следования. (Например, add - egg изоморфны)
// 2. буква может не меняться, а остаться такой же. (Например, note - code)
// Пример 1:
// Input: s = "foo", t = "bar"
// Output: false
// Пример 2:
// Input: s = "paper", t = "title"
// Output: true

import java.util.HashMap;

public class Isomorthwords {
    public static void main(String[] args) {
        String str1 = "add";
        String str2 = "egg";
        isIsomorth(str1, str2);
        System.out.println(isIsomorth(str1, str2));

    }

    public static boolean isIsomorth(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        if (str1.equals(str2)) {
            return true;
        }
         HashMap<Character, Character> stringHashMap = new HashMap<>();
         
         for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if (stringHashMap.containsKey(c1)) {
                if (stringHashMap.get(c1) != c2) {
                    return false;
                }
                else {
                    stringHashMap.put(c1, c2);

                }  
            }
         }
         return true;
    }
}
