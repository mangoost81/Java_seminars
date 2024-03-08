// Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
// результат a4b3c1d2.

public class CompressedString {
    public static void main(String[] args) {
        String str = "aaaabbbcdd";
        System.out.println(compressedString(str));

    }

    public static String compressedString(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char curent = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == curent) {
                count++;
            } else {
                sb.append(count).append(curent);
                curent = str.charAt(i);
                count = 1;

            }

        }
        sb.append(count).append(curent);
        return sb.toString();
    }
}
