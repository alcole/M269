package BST;

/**
 * Created by Alex on 16/05/2014.
 */
public class BSTTests {
    public static void main(String[] args) {
        BST t = new BST();
        t.TreeInsert(new Node(10));
        t.TreeInsert(new Node(9));
        t.TreeInsert(new Node(13));
        t.TreeInsert(new Node(12));
        t.TreeSearch(t.root, 9).printNode();
        t.TreeDelete(t, t.TreeSearch(t.root, 9));
        t.TreeSearch(t.root, 10).printNode();
        t.InorderTreeWalk(t.root);
    }
}
