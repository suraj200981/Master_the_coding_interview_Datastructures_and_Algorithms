import Maximum_Subarray.MaximumSubarrayQuadraticsSolution;
import Merge_Sorted_Arrays.mergeSortedArray;
import Reverse_String.reverseStringLinearSolution;
import Two_Sum.twoSumLinearSolution;
import Two_Sum.twoSumQuadraticSolution;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        int [] array1 = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubarrayQuadraticsSolution maxSubArrayQuad = new MaximumSubarrayQuadraticsSolution();
        System.out.println("Output: "+ maxSubArrayQuad.maxSubArray(array1));

    }

}
