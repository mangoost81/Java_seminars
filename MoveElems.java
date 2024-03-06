// Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а
// остальные - равны ему.

import java.util.Arrays;

public class MoveElems {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3,4,55,23,6,34,3,43,22,89,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,45,3};
        int val = 3;
        moveElemsToRight(nums, val);
        System.out.println(Arrays.toString(nums));
    }

    private static void moveElemsToRight(int[] nums, int val) {
        int leftIndex = 0;
        int rightIndex = nums.length-1;
        while (leftIndex<rightIndex) {
            while (nums[rightIndex] == val && leftIndex<rightIndex) {
                rightIndex --;
            }
        if(nums[leftIndex] == val){
            nums[leftIndex] = nums[rightIndex];
            nums[rightIndex] = 3;
            rightIndex --;
        }
        leftIndex++;
        }
    }
}
