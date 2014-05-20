package Unit4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Alex on 20/05/2014.
 * activity 4.1
 *
 */
public class QuickSelect {

    static int quickSelect(int k, List<Integer> aList) {
        if (aList.size() == 1) {
            return aList.get(0);
        }
        int pivotValue = aList.get(0);
        List<Integer> leftPart = new ArrayList<Integer>();
        List<Integer> rightPart = new ArrayList<Integer>();
        for (int i = 1; i < aList.size();i++ ) {
            if (aList.get(i) < pivotValue) {
                leftPart.add(aList.get(i));
            }
            else {
                rightPart.add(aList.get(i));
            }
        }
        if (leftPart.size() >= k) {
            return quickSelect(k, leftPart);
        }
        else if (leftPart.size() == k - 1) {
            return pivotValue;
        }
        else {
            return quickSelect(k - leftPart.size() - 1, rightPart);
        }
    }

    public static void main(String[] args) {
        List<Integer> theList = new ArrayList(Arrays.asList(2, 36, 5, 21, 8, 13, 11, 20, 5, 4, 1));
        System.out.println(quickSelect(6, theList));
    }
}
