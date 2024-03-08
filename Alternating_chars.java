// Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2,
// начиная с c1.
public class Alternating_chars {

    public static void main(String[] args) {
        int n = 500_000;
        char c1 = 'a';
        char c2 = 'b';

        long start = System.currentTimeMillis();
        alternating_charsString(n, c1, c2);
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        alternating_charsSb(n, c1, c2);
        System.out.println(System.currentTimeMillis() - start);

    }
    public static String alternating_charsString(int n, char c1, char c2) {
        String str ="";
        for (int i = 0; i < n/2; i++) {
            //str += c1 + c2; Не работает с символами, складывет значения символов
            str = str + c1 + c2;
            
        }
        return str;
    }

    public static String alternating_charsSb(int n, char c1, char c2) {
        StringBuilder sb = new StringBuilder(n); //Лучше сразу указать размер массива ()
        for (int i = 0; i < n/2; i++) {
            sb.append(c1).append(c2);
            
        }
        return sb.toString();
    }
}

