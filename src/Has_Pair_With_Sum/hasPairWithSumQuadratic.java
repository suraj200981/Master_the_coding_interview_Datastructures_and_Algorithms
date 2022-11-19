package Has_Pair_With_Sum;

public class hasPairWithSumQuadratic {
    public hasPairWithSumQuadratic(){

    }
    public Boolean pairFound(int[] arr, int target){
        for(int x=0;x<arr.length; x++){
            for (int y=0; y<arr.length; y++){
               if(arr[x]+arr[y]==target){ //pair found
                   System.out.println(arr[x]+" and "+ arr[y]+" make "+ target);
                   return true;
               }
            }
        }
        System.out.println("No pairs found");
        return false;
    }
}
