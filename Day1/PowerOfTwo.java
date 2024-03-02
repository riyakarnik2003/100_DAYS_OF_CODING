package Day1;
//LeetCode - 231 (easy)
public class PowerOfTwo {

    public static boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }

        while(n>1){
            if(n%2==0){
                n/=2;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
}
