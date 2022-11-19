package Contains_Common_Item;

import java.util.HashMap;

public class CommonItemLinearSolution {

    public CommonItemLinearSolution(){

    }
    //O(N) Linear solution
    public static boolean containsCommonItem(char[] arr1, char[] arr2){

        HashMap<Character, Boolean> map = new HashMap<Character, Boolean>();
        if(arr1.length==0 || arr2.length==0){
            return false;
        }
        for (int x=0; x<arr1.length; x++){
            map.put(arr1[x], true);
        }
        for(int x=0; x<arr2.length;x++){
            if(map.get(arr2[x])!=null){
                System.out.println(arr2[x]+" & "+ arr2[x]+" are the same");
                return true;
            }
        }
        System.out.println("Could not find matching chars");
        return false;
    }
}
