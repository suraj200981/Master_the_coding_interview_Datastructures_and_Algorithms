package Maximum_Subarray;

public class MaximumSubarrayLinearSolution {
    public MaximumSubarrayLinearSolution(){

    }
    public int maxSubArray(int[] nums) {
        int biggestSum = 0;
        int currentSum = 0;

        for (int x=0; x<nums.length; x++){
            currentSum = Math.max(nums[x], currentSum + nums[x]);
            biggestSum = Math.max(biggestSum, currentSum);
        }

        return biggestSum;
    }
}
