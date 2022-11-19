import Contains_Common_Item.CommonItemLinearSolution;
import Contains_Common_Item.CommonItemQuadraticsolution;

import java.util.Arrays;
import java.util.HashMap;

public class main {
    public static void main(String[] args) {

         char [] array1 = new char []{'a','b','c','x'};
         char [] array2 = new char []{'z','y','x'};

         //O(N^2) quadratic solution
        CommonItemQuadraticsolution quadraticsolution = new CommonItemQuadraticsolution();
//        System.out.println("Output:" + quadraticsolution.containsCommonItem(array1,array2));

        //O(N) Linear solution
        CommonItemLinearSolution linearSolution = new CommonItemLinearSolution();
        System.out.println("Output:" + CommonItemLinearSolution.containsCommonItem(array1,array2));

    }
}
