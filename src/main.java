import Merge_Sorted_Arrays.mergeSortedArray;
import Reverse_String.reverseStringLinearSolution;
import Two_Sum.twoSumLinearSolution;
import Two_Sum.twoSumQuadraticSolution;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        int [] array1 = new int[]{2,5,5,11};
        twoSumLinearSolution twoSum = new twoSumLinearSolution();
        System.out.println("Output: "+ Arrays.toString(twoSum.twoSum(array1, 10)));

    }

}
