package Unit2;

/**
 * Created by Alex on 16/05/2014.
 */
public class Item {
    int value;
    Item next;

    // constructors
    Item (int x) {// construct item with value x
        value = x;
    }

    Item (int x, Item p) { // construct item with value x and next p
        value = x;
        next  = p;
    }
}
