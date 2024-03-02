package Day1;
// Leetcode - 9 (easy)
public class palindrome {

    public static boolean isPalindrome(int x) {
        int temp=x;
        int c=0;
        while(x>0)
        {
            int r=x%10;
            c=(c*10)+r;
            x=x/10;
        }

        if(temp==c)
        {
            return true;
        }
        return false;
        
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
       
    }

}