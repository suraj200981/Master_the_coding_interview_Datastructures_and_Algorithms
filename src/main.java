import Contains_Duplicates.ContainsDuplicatesLinearSolution;
import Contains_Duplicates.ContainsDuplicatesQuadraticSolution;
import Maximum_Subarray.MaximumSubarrayLinearSolution;
import Maximum_Subarray.MaximumSubarrayQuadraticsSolution;
import Merge_Sorted_Arrays.mergeSortedArray;
import MoveZeros.MoveZerosQuadraticSolution;
import Reverse_String.reverseStringLinearSolution;
import Rotate_Array.RotateArraySolution;
import Two_Sum.twoSumLinearSolution;
import Two_Sum.twoSumQuadraticSolution;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        //[1,2,3,4,5,6,7] original
        //[5,6,7,1,2,3,4] new when k = 3

        //[-1,-100,3,99] original
        //[3,99,-1,-100] new when k = 2
        int [] array1 = new int[]{1,2,3,4,5,6,7};
        int [] array2 = new int[]{-1,-100,3,99};
        int [] array3 = new int[]{1,2,3};
        int [] array4 = new int[]{1,2};
        int [] array5 = new int[]{1};




        RotateArraySolution rotateArraySolution = new RotateArraySolution();
//        rotateArraySolution.rotate(array1,3);
//        System.out.println();
//        rotateArraySolution.rotate(array2,2);
        System.out.println();
        rotateArraySolution.rotate(array3,2);
//        System.out.println();
//        rotateArraySolution.rotate(array4,3);
//        System.out.println();
//        rotateArraySolution.rotate(array5,1);




    }

}
