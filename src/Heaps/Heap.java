package Heaps;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 17/05/2014.
 * from Chapter 6 of CLRS introduction to algorithms
 * Using the array based implementation
 * A max-heap must satisfy the property, for every node i
 * A[Parent(i)] >= A[i]
 */



public class Heap {

    List<Integer> Heap;
    int HeapSize;

    Heap() {
        HeapSize = 0;
        Heap = new ArrayList<Integer>();
        Heap.add(Integer.MAX_VALUE);
    }


    int getHeapSize() {
        return this.Heap.size();
    }

    //get parent's index from index of a node
    //can also use binary right shift by one position
    int Parent(int i){
        return i / 2;
    }


    //binary left shift also works
    int Left(int i){
        int l = 0;
        if (2 * i < this.getHeapSize()){
            l =  2 * i;
        }
        return l;
      }
    //binary left shift plus one
    int Right(int i){
        int r = 0;
        if (2 * i + 1 < this.getHeapSize()){
            r = 2 * i + 1;
        }
        return r;
    }

    void addElement(int x) {
        this.Heap.add(x);
    }
    // maintaining the heap property
    //recursive implementation - iterative may be more efficient(6.2-5)
    void MaxHeapify(int i){
        int l = Left(i);
        int r = Right(i);
        int largest;
        if (l > 0 && l <= this.getHeapSize() && this.Heap.get(l) > this.Heap.get(i) ) {
            largest = l;
        }
        else {
            largest = i;
        }
        if (r > 0 && r < this.getHeapSize() && this.Heap.get(r) > this.Heap.get(largest)) {
            largest = r;
        }
        if (largest != i) {
            int temp = this.Heap.get(i);
            this.Heap.set(i, this.Heap.get(largest));
            this.Heap.set(largest, temp);
            MaxHeapify(largest);
        }
    }

    //build max heap
    void BuildMaxHeap() {
        HeapSize = this.getHeapSize();
        for (int i = this.getHeapSize() / 2; i >= 1; i--) {
            MaxHeapify(i);
        }
    }

    //
    void Heapsort() {
        this.BuildMaxHeap();
        for (int i = this.Heap.size() - 1 ; i >= 1; i--) {
            int temp = this.Heap.get(i);
            this.Heap.set(i, this.Heap.get(1));
            this.Heap.set(1, temp);
            this.HeapSize--;
        }
    }
}
