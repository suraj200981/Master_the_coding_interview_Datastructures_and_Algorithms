package Merge_Sorted_Arrays;

import java.util.ArrayList;

public class mergeSortedArray {
    public mergeSortedArray(){

    }

    public int [] mergeArrays(int[]arr1, int[] arr2) {

        int count = Math.min(arr1.length, arr2.length);
        int[] newArr = new int[arr1.length + arr2.length];


        //[0,3,4,13] [4,6,30]
        for (int x = 0; x < count-1; x++) {

            if (arr1[x] < arr1[x+1]&& arr1[x]<arr2[x]) {
                newArr[x] = arr1[x];
            } else if (arr1[x] > arr1[x+1] && arr1[x]>) {
                newArr[x] = arr1[x];
                newArr[x+1] = arr2[x];
            } else {
                newArr[x] = arr1[x];
            }
        }
        return null;
    }

//        for(int x=0;x<newArr.length; x++){
//            System.out.println(newArr[x]);
//        }
//            return null;
//        }
    }

