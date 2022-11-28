package Merge_Sorted_Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class mergeSortedArray {
    public mergeSortedArray() {

    }

    public int[] mergeArrays(int[] arr1, int[] arr2) {

        ArrayList<Integer> newArr = new ArrayList<>();

        int firstArryItemFromArr1 = arr1[0];
        int firstArryItemFromArr2 = arr2[0];

        boolean isMerged = false;
        int x = 0;
        int y = 0;
        while (!isMerged) {
            if(newArr.size()-1==arr1.length-1+arr2.length-1){
                isMerged=true;
            }
            if(x==arr1.length){
                firstArryItemFromArr1 = arr2[y];
            }else if (y==arr2.length){
                firstArryItemFromArr2 = arr1[x];
            }
            if (firstArryItemFromArr1 < firstArryItemFromArr2) {
                if(x!=arr1.length-1) {
                    newArr.add(firstArryItemFromArr1);
                    x++;
                    firstArryItemFromArr1 = arr1[x];
                }else{
                    firstArryItemFromArr1 = arr1[arr1.length-1];
                    newArr.add(firstArryItemFromArr1);
                    x++;
                }
            } else if(firstArryItemFromArr1 > firstArryItemFromArr2) {
                if(y!=arr2.length-1) {
                    newArr.add(firstArryItemFromArr2);
                    y++;
                    firstArryItemFromArr2 = arr2[y];
                }
                else{
                    firstArryItemFromArr2 = arr2[arr2.length-1];
                    newArr.add(firstArryItemFromArr2);
                    y++;
                }
            }else if(firstArryItemFromArr1 == firstArryItemFromArr2){
                if(y!=arr2.length-1) {
                    newArr.add(firstArryItemFromArr2);
                    if(y>=arr2.length-1) {
                       continue;
                    }else{
                        y++;
                        firstArryItemFromArr2 = arr2[y];
                    }
                }
                if(x!=arr1.length-1) {
                    newArr.add(firstArryItemFromArr1);
                    if(x>=arr1.length-1) {
                        continue;
                    }else {
                        x++;
                        firstArryItemFromArr1 = arr1[x];
                    }

                }
            }

        }
        int [] resultArr = new int[newArr.size()];


        for (int k=0;k<newArr.size();k++){
            resultArr[k]=newArr.get(k);
        }
        //sort
        System.out.println("Merged array: " + newArr);

        return resultArr;
    }
}




