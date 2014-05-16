package BST;

/**
 * Created by Alex on 16/05/2014.
 */
public class Node {
    int key;
    Node left;
    Node right;
    Node p; //parent Node

    //constructor
    Node (int x) {
        key = x;
    }

    void print(){
        System.out.print(this);
        System.out.println("key: " + key);
    }

    void printNode(){
        System.out.print(key + " " + p + " " + left + " " + right);
    }
}