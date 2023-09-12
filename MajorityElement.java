//169

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        
    }


    // greedy approach
    public static  int majorityElement1(int[] nums) {
        
        int ele=nums[0];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0)
                ele=nums[i];
            count+=(ele==nums[i])?1:-1;
        }
        return ele;
    }


    //sorting approach

    public static int majorityElement2(int[] nums) {
        
        Arrays.sort(nums);
        return (nums[nums.length/2]);
    }
}
