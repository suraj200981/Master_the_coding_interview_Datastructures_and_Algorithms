package Contains_Duplicates;

public class ContainsDuplicatesQuadraticSolution {
    public ContainsDuplicatesQuadraticSolution(){

    }

    public boolean containsDuplicate(int[] nums) {
        boolean result = false;

        for(int x=0; x<nums.length-1; x++){
            for (int y=x+1; y<nums.length; y++){
                if(nums[x]==nums[y]){//duplicate found
                    result = true;
                }
            }
        }

        return result;
    }
}
