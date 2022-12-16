package Maximum_Subarray;

public class MaximumSubarrayQuadraticsSolution {
    public MaximumSubarrayQuadraticsSolution(){

    }
    //5,4,-1,7,8
    public int maxSubArray(int[] nums) {
        int biggestSum = 0;
        int currentSum = 0;

        if(nums.length==1){
            return nums[0];
        }
        for(int x=0; x<nums.length; x++){
            currentSum+=nums[x];//-2
            if(x==0){
                biggestSum=currentSum;//-2
            }
            if(currentSum>biggestSum){
                biggestSum=currentSum;
            }
            for(int y=x+1; y< nums.length; y++){
                currentSum+=nums[y];
                if(currentSum>biggestSum){
                    biggestSum=currentSum;
                }
            }
            currentSum =0;
        }
    return biggestSum;
    }
}
