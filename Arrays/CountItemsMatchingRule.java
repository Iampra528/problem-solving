//1773

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingRule {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        list.add(Arrays.asList("phone","blue","pixel"));
        list.add(Arrays.asList("computer","silver","lenovo"));
        list.add(Arrays.asList("phone","gold","iphone"));

        String rk = "color";
        String rv = "silver";

        System.out.println(countMatches(list, rk, rv));

    }
    
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int j = 0;
        int count = 0;
        if(ruleKey.equals("color"))
            j=1;
        else if(ruleKey.equals("name"))
            j=2;

        for(int i=0;i<items.size();i++){
            if((items.get(i).get(j)).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}