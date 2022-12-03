package Two_Sum;

public class twoSumQuadraticSolution {

    public twoSumQuadraticSolution(){

    }

    public int[] twoSum(int[] nums, int target) {
        int[] twoNums = new int[2];
        boolean targetAchieved = false;
        for(int x=0; x<nums.length; x++){
            if(targetAchieved){
                break;
            }
            int currentNum = nums[x];
            for(int y=1; y<nums.length; y++){
                if(currentNum+nums[y]==target && (y!=x)){
                    twoNums[0] = x;
                    twoNums[1] = y;
                    targetAchieved = true;
                    break;
                }
            }
        }
        return twoNums;
    }
}
