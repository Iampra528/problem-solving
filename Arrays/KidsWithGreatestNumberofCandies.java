import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberofCandies {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(kidsWithCandies(arr, 1));
    }
     public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatest = candies[0];
        for(int i = 0; i<candies.length;i++){
            if(greatest < candies[i])
                greatest = candies[i];
        }
        List<Boolean> list = new ArrayList<>();
        for(int i = 0 ; i < candies.length ; i++){
            list.add((candies[i]+extraCandies)>=greatest); 
        }
        return list;
    }
}
