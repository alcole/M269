package Heaps;

/**
 * Created by Alex on 20/05/2014.
 */
public class PriorityQueue extends Heap {

    int HeapMaximum() {
        return this.Heap.get(1);
    }

    void HeapIncreaseKey(int i, int key) {
        if (key < this.Heap.get(i)) {
            //error "new key is smaller than current key"
        }
        this.Heap.set(i, key);
        while (i > 1 && this.Heap.get(Parent(i)) < this.Heap.get(i)) {
            int temp = this.Heap.get(i);
            this.Heap.set(i, this.Heap.get(Parent(i)));
            this.Heap.set(Parent(i), temp);
            i = Parent(i);
        }
    }

    void MaxHeapInsert(int key) {
        this.HeapSize++;
        this.Heap.add(Integer.MIN_VALUE);
        HeapIncreaseKey(HeapSize, key);
    }

    //6.1 Build a max heap repeatedly using MaxHeapInsert
}
