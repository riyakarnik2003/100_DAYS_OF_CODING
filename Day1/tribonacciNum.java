package Day1;
//Leetcode - 1137 (easy)
public class tribonacciNum {

    public static int tribonacci(int n) {
        if(n==0)
         {
             return 0;
         }
 
         if(n==1 || n==2)
         {
             return 1;
         }
 
         //return tribonacci(n-3)+tribonacci(n-2)+tribonacci(n-1); 
         int [] t = new int[n+1];
         t[0]=0;
         t[1]=1;
         t[2]=1;
 
         for(int i=3;i<=n;i++)
         {
             t[i]=t[i-3]+t[i-2]+t[i-1];
         }
 
         return t[n];
     }
    public static void main(String[] args) {
        System.out.println(tribonacci(5));
        
    }
}
