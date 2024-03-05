package Day3;

import java.util.Arrays;

public class squareSortedArr {

    public static void sortedSquares(int[] nums) {

        int num1[]=new int[nums.length];

       
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=nums[i]*nums[i];
        }
        
        for(int i=0;i<nums.length;i++)
        {
            num1[i]=nums[i];
        }
        Arrays.sort(num1);

       for(int i=0;i<nums.length;i++)
       {
        System.out.println(num1[i]);
       }
        
    }
    public static void main(String[] args) {
        int nums[]={-4,1,0,3,1,0};
        sortedSquares(nums);
        
    }
}
