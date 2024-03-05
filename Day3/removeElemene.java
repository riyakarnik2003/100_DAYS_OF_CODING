package Day3;

public class removeElemene {
    public static int removeElement(int[] nums, int val) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[c]=nums[i];
                c++;
            }
        }
        return c;
    }

   public static void main(String[] args) {
    int nums[]={3,2,2,3};
    System.out.println(removeElement(nums, 3));
   }

}
