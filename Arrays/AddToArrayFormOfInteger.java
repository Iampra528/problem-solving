//989

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AddToArrayFormOfInteger {

    public static void main(String[] args) {
        int[] arr = {9,9,9,9,9,9,9,9,9,9};
        System.out.println(addToArrayForm(arr, 1));
        
     }
     // not suitable for large values in array
    public static List<Integer> addToArrayForm(int[] num, int k) {
        long tempNo = 0 , number = 0;
        for(int i = 0 ; i < num.length ; i++){
            tempNo = tempNo*10+num[i];
        }
        number = tempNo + k;
        System.out.println(tempNo);
        System.out.println(number);
        
        List<Integer> list = new ArrayList<>();
        
        while(number!=0){
            list.add(0,(int)number%10);
            number/=10;
        }

        return list;
    }

    
    
    // different approach
    public List<Integer> addToArrayForm1(int[] num, int K) {
    List<Integer> res = new LinkedList<>();
    for (int i = num.length - 1; i >= 0; --i) {
        res.add(0, (num[i] + K) % 10);
        K = (num[i] + K) / 10;
    }
    while (K > 0) {
        res.add(0, K % 10);
        K /= 10;
    }
    return res;
}
}