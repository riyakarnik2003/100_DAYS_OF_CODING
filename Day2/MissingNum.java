package Day2;

public class MissingNum {

    public static int missingNumber(int[] nums) {
        int n = nums.length;
    int total = n * (n + 1)/2;
    int nums_Sum = 0;
    for(int i=0;i<nums.length;i++)
    {
        nums_Sum+=nums[i];
    }
    return total - nums_Sum;
    }
    public static void main(String[] args) {
        int nums[]={3,0,1};
        System.out.println(missingNumber(nums));
        
    }
}
