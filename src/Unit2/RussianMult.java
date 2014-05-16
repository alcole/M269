package Unit2;

/**
 * Russian multiplication algorithm Python activity 2.10
 * Created by Alex on 16/05/2014.
 */
public class RussianMult {

    public static int russianMult(int x, int y) {
        int result = 0;
        while (x > 0) {
            if (x % 2 == 1) {
                result += y;
            }
            y *= 2;
            x /= 2;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(russianMult(6, 6));
        System.out.println(russianMult(4, 7));
    }
}
