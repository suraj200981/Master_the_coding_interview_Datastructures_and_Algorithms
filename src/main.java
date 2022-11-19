import Contains_Common_Item.CommonItemLinearSolution;
import Contains_Common_Item.CommonItemQuadraticsolution;
import Has_Pair_With_Sum.hasPairWithSumLinear;
import Has_Pair_With_Sum.hasPairWithSumQuadratic;

import java.util.Arrays;
import java.util.HashMap;

public class main {
    public static void main(String[] args) {
        int[] array1 = new int[]{1,2,3,9};
        int[] array2 = new int[]{1,2,4,4};

//      hasPairWithSumQuadratic sumQuadratic = new hasPairWithSumQuadratic();
//      System.out.println("output: "+ sumQuadratic.pairFound(array2, 8));
        hasPairWithSumLinear sumLinear = new hasPairWithSumLinear();
        System.out.println("output: "+ sumLinear.pairFound(array1, 8));
    }

}
