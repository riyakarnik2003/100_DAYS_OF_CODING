package Day3;

public class LargestNumTwiceOfOther {

    public static int dominantIndex(int[] nums) {
        int max = -1, smax = -1, ans = -1;
                 for (int i = 0; i < nums.length; ++i) {
                     if (nums[i] > max) {
                         smax=max;
                         max = nums[i];
                         ans = i;
                     } else if (nums[i] > smax) 
                         smax = nums[i];
                 }
                 if(max>=smax*2){
                     return ans;
                 }

                 return -1;
             
                }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(dominantIndex(arr));
    }
}
