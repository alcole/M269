package Heaps;

/**
 * Created by Alex on 20/05/2014.
 */
public class PQTests {

    public static void main(String[] args) {
        PriorityQueue PQ = new PriorityQueue();
        PQ.MaxHeapInsert(14);
        PQ.MaxHeapInsert(2);
        PQ.MaxHeapInsert(16);
        PQ.MaxHeapInsert(1);
        PQ.MaxHeapInsert(4);
        PQ.MaxHeapInsert(10);
        PQ.MaxHeapInsert(3);
        PQ.MaxHeapInsert(9);
        PQ.MaxHeapInsert(8);
        PQ.MaxHeapInsert(7);


       // System.out.println(PQ.HeapMaximum());

        for (Integer element: PQ.Heap) {
            System.out.println(element);
        }
    }
}
