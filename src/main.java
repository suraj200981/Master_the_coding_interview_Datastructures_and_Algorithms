import Merge_Sorted_Arrays.mergeSortedArray;
import Reverse_String.reverseStringLinearSolution;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        int [] array1 = new int[]{0,3,4,13};
        int [] array2 = new int[]{4,6,30};


        mergeSortedArray msa = new mergeSortedArray();
        System.out.println("Output: "+ Arrays.toString(msa.mergeArrays(array1, array2)));

    }

}
