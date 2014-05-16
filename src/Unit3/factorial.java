package Unit3;
/**
 * Created by Alex on 16/05/2014.
 * factorial function from activity 3.3
 */
public class factorial {
    static int callTotal = 0;

    public static int factorial(int n) {
        callTotal ++;
        int thisCall = callTotal;
        System.out.println("Call " + thisCall + " of function with n = " + n);
        if (n == 1) {
            System.out.println("Base case reached, so begin to unwind, returning 1 to call " + (thisCall - 1));
            return 1;
        }
        else {
            int partialResult = factorial(n - 1);
            if (thisCall - 1 == 0) {
                System.out.println("unwinding, call " + thisCall + " returning the result of " + n + "*" + partialResult);
            }
            else {
                System.out.println("unwinding, call " + thisCall + " returning the result of " + n + "*" + partialResult + " to call " + (thisCall -1));
            }
            return n * partialResult;
        }
    }

    public static void main(String[] args) {
        int anInt = (int)(Math.random() * 10 + 1);
        System.out.println(factorial(anInt));
    }
}
