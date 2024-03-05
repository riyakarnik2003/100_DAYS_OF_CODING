package Day3;

public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        
        int arr[]=new int[2];
       int s=0;
       int e=numbers.length-1;
       while(s<e){
           int sum=numbers[s]+numbers[e];
           if(target==sum)
           {
               arr[0]=s+1;
                arr[1]=e+1;
                break;
           }

           else if(sum>target)
           {
               e--;
           }
           else{
               s++;
           }
       }
       return arr;

    }

    public static void main(String[] args) {
        int numbers[]={2,7,11,15};
        System.out.println(twoSum(numbers, 9));
    }
}
