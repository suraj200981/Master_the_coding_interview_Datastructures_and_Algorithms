package Has_Pair_With_Sum;

import java.util.ArrayList;
import java.util.HashMap;

public class hasPairWithSumLinear {
    public hasPairWithSumLinear(){

    }
    public Boolean pairFound(int[] arr, int target){

        ArrayList<Integer> pairVal = new ArrayList<>();
        for(int x=0;x<arr.length; x++){
            pairVal.add(target - arr[x]);
            if (pairVal.get(x) == arr[x]) {
                    System.out.println(arr[x] + " and " + arr[x] + " make " + target);
                    return true;
                }
            }

        System.out.println("No pairs found");
        return false;
    }
}
