package Rotate_Array;
import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArraySolution {
    public RotateArraySolution(){

    }
    //[1,2,3,4,5,6,7] original
    //[5,6,7,1,2,3,4] new when k = 3

    //[-1,-100,3,99] original
    //[3,99,-1,-100] new when k = 2

//    nums =
//            [1,2,3] original
//    k =
//            2
    // [2,3,1] new with k =  2

    public void rotate(int[] nums, int k) {

        int count=0;
        int [] reversedArray = new int[nums.length];
        int leftOver = Math.abs(nums.length - k);
        if (nums.length == 1 || k==0) {
            System.out.println(Arrays.toString(nums));

        }
        else if(nums.length==2){
            if(k%2==0){
                System.out.println(Arrays.toString(nums));
            }else{
                int temp1=0;
                int temp2=0;
                temp1 = nums[0];
                temp2 = nums[1];
                nums[0] = temp2;
                nums[1] = temp1;
                System.out.println(Arrays.toString(nums));
            }
        }

        else {
            //reverse all numbers
            for(int x=nums.length-1; x>=0; x--){
                reversedArray[count++]= nums[x];
            }
            System.out.println(Arrays.toString(reversedArray) + " Reversed array all numbers");

            count=0;
            //reverse first k numbers
            for(int x=k-1; x>=0;x--){
                nums[count++]=reversedArray[x];
            }
            System.out.println(Arrays.toString(nums) + " reverse first k");

            int endpoint=0;
            if(nums.length%2==0){
                count=leftOver;
                endpoint= leftOver;
            }else{
                count=leftOver-1;
                endpoint= leftOver-1;
            }

            //reverting array length 'n'-k numbers
            for(int x=reversedArray.length-1; x>=endpoint; x--){
                nums[count++] = reversedArray[x];
            }

            System.out.println(Arrays.toString(nums) + " reverting n-k numbers");
        }
    }
}
