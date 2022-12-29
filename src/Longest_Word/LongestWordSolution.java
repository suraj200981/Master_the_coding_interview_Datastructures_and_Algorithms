package Longest_Word;

public class LongestWordSolution {

    public LongestWordSolution() {

    }

    public String longestWord(String sen) {
        String finalSen = "";
        sen = sen.replaceAll("[^a-zA-Z]", " ");
        finalSen = sen.replaceAll("\\s+", ",");
        System.out.println(finalSen);
        char[] charArr = finalSen.toCharArray();

        for (int x = 0; x < charArr.length; x++) {
            System.out.print(charArr[x]);
        }
        System.out.println();
        StringBuilder biggestWord = new StringBuilder();

        int count = 0;
        int biggest = 0;
        for (int x = 0; x < charArr.length; x++) {
            if (charArr[x] == ',') {
                if (biggestWord.toString().length() > biggest) {
                    biggest = biggestWord.toString().length();
                    sen = biggestWord.toString();
                    count = 0;
                    biggestWord.setLength(0);
                }
                continue;
            } else {
                count++;
                biggestWord.append(charArr[x]);
            }
        }

        if (biggestWord.toString().length() > biggest) {
            sen = biggestWord.toString();
        }
        return sen;
    }
}
