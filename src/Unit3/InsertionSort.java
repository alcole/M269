package Unit3;

/**
 * Created by Alex on 16/05/2014.
 */
public class InsertionSort {

    static int[] InsertionSort (int[] x)
    {
        for (int i=1; i < x.length; i++)
        {
            // insert x[i] into the already sorted
            // sequence  x[0]...x[i-1]
            int key = x[i];
            int j = i;
            while ( j > 0 && key < x[j-1] )
            {
                // key should be in front of x[j-1]
                x[j] = x[j-1];
                j-- ;
            }
            // now j==0  or, if j>0, then  x[j-1] <= key
            x[j] = key;
        }

        return x;
    }

}
