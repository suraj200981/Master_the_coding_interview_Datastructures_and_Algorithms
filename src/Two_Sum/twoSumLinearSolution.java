package Two_Sum;

public class twoSumLinearSolution {
    public twoSumLinearSolution(){

    }
    public int[] twoSum(int[] nums, int target) {
        int[] twoNums = new int[2];
        boolean targetAchieved = false;
        int x = 0;
        int y = 1;

        while(!targetAchieved){
            if(nums[x]+nums[y]!=target){
                if(nums.length-1==y){
                    y=0;
                    x++;
                }
                y++;
            }else {
                if(nums[x]+nums[y]==target && x!=y) {
                    twoNums[0] = x;
                    twoNums[1] = y;
                    targetAchieved = true;
                }
                y++;
            }
        }
        return twoNums;
    }
}
