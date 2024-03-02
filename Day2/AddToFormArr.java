package Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToFormArr {

    public static List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> list = new ArrayList<>();

        int p=num.length-1;
        int carry=0;

        while(p>=0 || k>0)
        {
            int numVal=0;
            if(p>=0)
            {
                numVal=num[p];
            }

            int d=k%10;
            int sum=numVal+d+carry;
            int digit=sum%10;
            carry=sum/10;

            list.add(digit);

            p--;
            k=k/10;
        }
        if(carry>0)
        {
            list.add(carry);
        }
        Collections.reverse(list);
        return list;

    }
    public static void main(String[] args) {
        int num[]={1,2,0,0};

        System.out.println(addToArrayForm(num, 34));
        
    }
}
