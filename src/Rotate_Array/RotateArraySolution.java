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
    // [3,1,2] new with k =  2

    public void rotate(int[] nums, int k) {

        if (nums.length == 1 || k==0) {
            System.out.println(Arrays.toString(nums));

        } else {

            int count = 0;
            int y = 0;
            if (nums.length % 2 == 0) {
                y = k;
            } else {
                y = k + 1;
            }
            if(y==nums.length){
                y=1;
            }
            int leftOver = Math.abs(nums.length - k);

            if(leftOver==0){
                System.out.println(Arrays.toString(nums));

            }else {

                int[] copyArrUpToSplit = new int[leftOver];

                System.out.println();
                System.out.println(String.valueOf(leftOver));

                for (int x = 0; x < leftOver; x++) {
                    copyArrUpToSplit[x] = nums[x];
                }

                System.out.println();
                System.out.println("First half " + Arrays.toString(copyArrUpToSplit));
                System.out.println();
                if(nums.length==2){
                    y=1;
                    k= nums.length-1;
                }
                for (int x = 0; x < k; x++) {
                    nums[x] = nums[y++];
                }
                System.out.println(Arrays.toString(nums));

                if (nums.length % 2 == 0) {
                    leftOver++;
                }

                for (int x = leftOver - 1; x < nums.length; x++) {
                    nums[x] = copyArrUpToSplit[count++];
                }

                System.out.println(Arrays.toString(nums));

            }
        }
    }
}
