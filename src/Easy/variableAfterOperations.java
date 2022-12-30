package Easy;

public class variableAfterOperations {
    public variableAfterOperations() {

    }

    public int finalValueAfterOperations(String[] operations) {

        int result = 0;
        //check the operations
        for (int x = 0; x < operations.length; x++) {
            if (operations[x].equals("--X") || operations[x].equals("X--")) {
                result = result - 1;
            } else if (operations[x].equals("X++") || operations[x].equals("++X")) {
                result = result + 1;
            }
        }
        return result;
    }
}
