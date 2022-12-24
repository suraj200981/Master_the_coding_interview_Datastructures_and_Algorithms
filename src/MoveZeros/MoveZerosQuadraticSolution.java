package MoveZeros;

import java.util.Arrays;

public class MoveZerosQuadraticSolution {
    public MoveZerosQuadraticSolution(){

    }
    //[0, 1, 0, 3, 12]
    public void moveZeroes(int[] nums) {

        int count = 0;
        //count all the zeros
        //i bascially want to exclude the zeros but keep a count of the total non zeros
        for (int x= 0; x<nums.length; x++){
           if(nums[x]!=0){
               nums[count]= nums[x];
               count++;
           }
        }
        //moving zeros from starting index of count
        for (int x=count; x< nums.length;x++){
            nums[x]= 0;
        }
        System.out.println("Output: " + Arrays.toString(nums));
    }
}
