package BST;

/**
 * Created by Alex on 16/05/2014.
 * Based on Chapter 12 of CLRS intro to algorithms
 */

public class BST {
    Node root = null;

    //call on the root node to display all the nodes
    void InorderTreeWalk(Node x) {
        if (x != null) {
            InorderTreeWalk(x.left);
            x.print();
            InorderTreeWalk(x.right);
        }
    }

    // finds the node with the matching key, call initially with the root node
    Node TreeSearch(Node x, int k) {
        if (x == null || k == x.key) {
            return x;
        }
        if (k < x.key) {
            return TreeSearch(x.left, k);
        }
        else {
            return TreeSearch(x.right, k);
        }
    }

    //unrolls recursion into a while loop
    Node IterativeTreeSearch(Node x, int k) {
        while (x != null && k != x.key) {
            if (k < x.key) {
                x = x.left;
            }
            else {
                x = x.right;
            }
        }
        return x;
    }

    // properties of BST guarantee left most key is the minimum
    Node TreeMinimum(Node x) {
        while (x.left != null) {
            x = x.left;
        }
        return x;
    }

    // right most key is maximum
    Node TreeMaximum(Node x) {
        while (x.right != null) {
            x = x.right;
        }
        return x;
    }

    //Successor of node x is the node with the smallest key greater than the x.key
    Node TreeSuccessor(Node x) {
        if (x.right != null) {
            return TreeMinimum(x.right);
        }
        Node y = x.p;
        while (y != null && x == y.right) {
            x = y;
            y = y.p;
        }
        return y;
    }

    //Predecessor - largest key smaller than x.key
    Node TreePredecessor(Node x){
        if (x.left != null) {
            return TreeMaximum(x.left);
        }
        Node y = x.p;
        while (y != null && x == y.left) {
            x = y;
            y = y.p;
        }
        return y;
    }

    //insertion - this.TreeInsert
    void TreeInsert(Node z) {
        Node y = null;
        Node x = this.root;
        while (x != null) {
            y = x;
            if (z.key < x.key) {
                x = x.left;
            }
            else {
                x = x.right;
            }
        }
        z.p = y;
        if (y == null) {
            this.root = z; //tree was empty
        }
        else if (z.key < y.key) {
            y.left = z;
        }
        else {
            y.right = z;
        }
    }

    //supports the deletion
    void Transplant(BST T, Node u, Node v) {
        if (u.p == null) {
            T.root = v;
        }
        else if (u == u.p.left) {
            u.p.left = v;
        }
        else {
            u.p.right = v;
        }
        if (v != null){
            v.p = u.p;
        }
    }

    // Deletes a node from the tree
    void TreeDelete(BST T, Node z) {
        if (z.left == null) {
            Transplant(T, z, z.right);
        }
        else if (z.right == null) {
            Transplant(T, z, z.left);
        }
        else {
            Node y = TreeMinimum(z.right);
            if (y.p != z) {
                Transplant(T, y, y.right);
                y.right = z.right;
                y.right.p = y;
            }
            Transplant(T, z, y);
            y.left = z.left;
            y.left.p = y;
        }
    }
}
