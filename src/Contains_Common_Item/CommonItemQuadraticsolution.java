package Contains_Common_Item;
public class CommonItemQuadraticsolution {
    public CommonItemQuadraticsolution(){

    }
    //O(N^2) Quadratic solution
    public boolean containsCommonItem(char[] arr1, char[] arr2){

        for (int x= 0; x<arr1.length; x++){
            for (int y=0; y<arr2.length; y++){
                if(arr1[x]==arr2[y]){
                    System.out.println(arr1[x]+" & "+ arr2[y]+" are the same");
                    return true;
                }
            }
        }
        System.out.println("Could not find matching chars");
        return false;
    }
}