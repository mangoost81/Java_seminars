// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
// максимальное количество подряд идущих 1.

public class Nums {
    public static void main(String[] args) {
        int array[] = {1,1,0,1,1,1};
        int sum = getSumOnes(array);
        System.out.println(sum);
    }

    private static int getSumOnes(int[] array) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 1){
                count ++;
            }
            else{
                count = 0; 
            }
            sum = Math.max(sum, count);
    
        }
        return sum;
    }
}
