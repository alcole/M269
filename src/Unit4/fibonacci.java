package Unit4;

/**
 * Created by Alex on 16/05/2014.
 * fibonacci function act 4.8
 */
public class fibonacci {

    static void fibonacci(int n) {
        int numToPrint = 0;
        int nextNum = 1;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(numToPrint + " ");
            temp = numToPrint;
            numToPrint = nextNum;
            nextNum = temp + nextNum;
        }
    }

    public static void main(String[] args) {
        fibonacci(20);
    }
}
