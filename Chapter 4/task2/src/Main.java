public class Main {

    /**
     * Outputs the specified number of Fibonacci numbers
     * @param value
     */
    private static void fibonacci(int value){
        int term = 1;
        int term2 = 1;
        for(int i = 0;i < value;i++){
            System.out.print(term + " ");
            term2 += term;
            term = term2 - term;
        }
    }

    public static void main(String[] args) {
        fibonacci(6);
    }//Output 1 1 2 3 5 8
}