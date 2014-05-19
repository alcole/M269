package Heaps;

/**
 * Created by Alex on 19/05/2014.
 */

public class HeapTests {
    public static void main(String[] args) {
        Heap he = new Heap();
        he.addElement(14);
        he.addElement(2);
        he.addElement(16);
        //he.addElement(14);
        he.addElement(1);
        he.addElement(4);
        he.addElement(10);
        he.addElement(3);
        he.addElement(9);
        he.addElement(7);
        he.addElement(8);

        for (Integer element: he.Heap) {
            System.out.println(element);
        }
        System.out.println();

        he.BuildMaxHeap();

        for (Integer element: he.Heap) {
            System.out.println(element);
        }

        he.Heapsort();
        //System.out.println(he.getHeapSize());
        //System.out.println(he.Heap.get(4));
        for (Integer element: he.Heap) {
            System.out.println(element);
        }
        he.BuildMaxHeap();
        for (Integer element: he.Heap) {
            System.out.println(element);
        }
    }
}
