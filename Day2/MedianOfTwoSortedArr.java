package Day2;
/**
 * MedianOfTwoSortedArr
 */
import java.util.*;
public class MedianOfTwoSortedArr {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int c = m+n;
        int mid=0;
        int middle;
        double total=0;
        
        int nums3[]=new int[c];
        int high = nums3.length-1;
        int low = 0;

        for(int i=0;i<nums1.length;i++)
        {
            nums3[i]=nums1[i];
        }

        for(int i=0;i<nums2.length;i++)
        {
            nums3[n+i]=nums2[i];
        }
        Arrays.sort(nums3);
      
//odd case

 
        if(nums3.length %2 !=0){
          mid = (high+low)/2;
          middle = nums3[mid];
          return middle;
          

        }

        else{

            mid = (high+low)/2;
            total = (double)(nums3[mid]+nums3[mid+1])/2;
            
        }
        return total;
    }
public static void main(String[] args) {

    int nums1[]={1,3};
    int nums2[]={2};
    System.out.println(findMedianSortedArrays(nums1, nums2));
    
}
    
}