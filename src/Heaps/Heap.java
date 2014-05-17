package Heaps;
/**
 * Created by Alex on 17/05/2014.
 * from Chapter 6 of CLRS introduction to algorithms
 * Using the array based implementation
 * A max-heap must satisfy the property, for every node i
 * A[Parent(i)] >= A[i]
 */
public class Heap {

    //get parent's index from index of a node
    //can also use binary right shift by one position
    int Parent(int i){
        return i / 2;
    }

    //binary left shift also works
    int Left(int i){
        return 2 * i;
      }
    //binary left shift plus one
    int Right(int i){
        return 2 * i + 1;
    }
}
