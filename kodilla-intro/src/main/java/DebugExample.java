public class DebugExample {
    public static void main(String[] args) {
        int firstNumber = 87;
        int secondNumber = 865;

        if(firstNumber>secondNumber){
            substractDisplay(firstNumber, secondNumber);
        }
        else {
            sumDisplay(firstNumber, secondNumber);
        }

    }
    public static void sumDisplay(int a, int b){
        int result = a + b;
        System.out.println(result);
    }
    public static void substractDisplay(int a, int b){
        int result = a - b;
        System.out.println(result);
    }

}
