package Reverse_String;

public class reverseStringLinearSolution {
    public reverseStringLinearSolution(){

    }
    //O(N) Linear solution
    public String reverse(String str){
           char[] charArr=  str.toCharArray();
           char[] backwardsArr = new char[charArr.length];
           int count = 0;
        for (int x=charArr.length-1; x>=0; x--){
            backwardsArr[count] = charArr[x];
            count++;
        }
        str="";
        StringBuilder strBuilder = new StringBuilder(str);
        for(int x = 0; x<backwardsArr.length; x++){
            strBuilder.append(backwardsArr[x]);
       }
        str = strBuilder.toString();
        return str;
    }
}
