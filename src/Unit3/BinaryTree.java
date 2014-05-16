package Unit3;

/**
 * Created by Alex on 16/05/2014.
 */
public class BinaryTree {
    Node root = null;

    void insertLeft(Node p, int newNode) {
        if (p.leftChild == null) {
            p.leftChild = new Node(newNode);
        }
        else {
            Node t = new Node(newNode);
            t.leftChild = p.leftChild;
            p.leftChild = t;
        }
    }

    void insertRight(Node p, int newNode) {
        if (p.rightChild == null) {
            p.rightChild = new Node(newNode);
        }
        else {
            Node t = new Node(newNode);
            t.rightChild = p.rightChild;
            p.rightChild = t;
        }
    }

    Node getRightChild(Node p) {
        return p.rightChild;
    }

    Node getLeftChild(Node p) {
        return p.leftChild;
    }

    int getRootKey() {
        return root.key;
    }

    void setRootKey(int x) {
        root = new Node(x);
    }
}
