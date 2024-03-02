package Day2;

public class MaximumArrayProduct {

    public static int maxProduct(int[] arr) {
        int productMax=1;
        int max=0;
        
        for(int i=0;i<arr.length;i++)
        {
            
            

            for(int j=i+1;j<arr.length;j++)
            {
                productMax=(arr[i]-1)*(arr[j]-1);
                
                max=Math.max(max, productMax);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,2};
        System.out.println(maxProduct(arr));
        
    }
}
