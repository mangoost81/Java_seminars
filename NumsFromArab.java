// Написать метод, который переведет число из римского формата записи в арабский.
// Например, MMXXIV = 2024
// 'V', 5
// 'X', 10
// 'L', 50
// 'C', 100
// 'D', 500
// 'M', 1000
import java.util.HashMap;
import java.util.Map;



public class NumsFromArab {
    public static void main(String[] args) {      
        System.out.println(arabicToRoman("MMXXII"));
    }

    public static Map<Character,Integer> romanArabicMap() {
        Map<Character, Integer> dict = new HashMap<>();
        dict.put('I', 1);
        dict.put('V', 5);
        dict.put('X', 10);
        dict.put('L', 50);
        dict.put('C', 100);
        dict.put('D', 500);
        dict.put('M', 1000);

        return dict;
    }

    public static Integer arabicToRoman(String romannum) {
        Map<Character, Integer> map = romanArabicMap();
        int res = 0;
        int prevnum = 0;
        for (int i = romannum.length()-1; i >= 0; i--) {
            int currentnum = map.get(romannum.charAt(i));
            if (currentnum < prevnum) {
                res = res - currentnum;
            }
            else {
                res += currentnum;
            }
            prevnum = currentnum;
        }
        return res;
    }
}
