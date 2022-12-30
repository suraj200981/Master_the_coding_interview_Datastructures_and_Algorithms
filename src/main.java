import Easy.variableAfterOperations;

public class main {
    public static void main(String[] args) {

        String [] operations = new String[] {"--X","X++","X++"};
        variableAfterOperations programmingLanguage = new variableAfterOperations();
        System.out.println("Output: "+ programmingLanguage.finalValueAfterOperations(operations));
    }

}
