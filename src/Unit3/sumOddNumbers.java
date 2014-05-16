package Unit3;

/**
 * Created by Alex on 16/05/2014.
 * sum of odd function activity 3.4a
 */
public class sumOddNumbers {

    static int sumOddNumbers(int n) {
        assert (n > 0);
        if (n == 1) {
            return 1;
        }
        else {
            return ( (n * 2) - 1 ) + sumOddNumbers(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(sumOddNumbers(5));
    }
}
