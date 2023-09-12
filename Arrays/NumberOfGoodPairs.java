import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,1,1,2};
        System.out.println(numIdenticalPairs2(arr));
    }
    // brute force approach
    public static int numIdenticalPairs1(int[] nums) {
        int count = 0;

        for(int i = 0 ; i < nums.length-1 ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                if(nums[i]==nums[j])
                    count++;
            }
        }
        return count;
    }

     //Optimized approach using HashMap O(N) time and O(1) auxiliary space
    public static int numIdenticalPairs2(int[] guestList) {
        Map<Integer, Integer> hall = new HashMap<>();
        int handshakes = 0;
        for(int people : guestList){
            int friend = hall.getOrDefault(people,0);
            handshakes += friend;
            hall.put(people, friend+1);
        }
        return handshakes;
    }

    public static int numIdenticalPairs3(int[] nums) {
        
        int ans = 0;
        int[] count = new int[101];
        
        for(int n: nums)
            count[n]++;
        
        for(int n: count)
            ans += (n * (n - 1))/2;
        
        return ans;
    }
}
