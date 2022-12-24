package Contains_Duplicates;

import java.util.Arrays;

public class ContainsDuplicatesLinearSolution {
    public ContainsDuplicatesLinearSolution(){

    }
    //1,2,3,1
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);//makes sure sorted first
        for (int i = 1; i < nums.length; i++) {
            //start from the index of the next element to check
            if (nums[i] == nums[i-1])//compare the previous element to the current element
                return true;
        }
        return false;
    }
}
