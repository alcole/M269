package Unit2;

/**
 * Created by Alex on 16/05/2014.
 * linear stack, as described in Unit 2
 */
public class StackADT {
    Item Top = null; //top of the stack

    public void push(int x) {
        Top = new Item(x, Top);
    }

    public int pop() {
        int x = -1;
        if (!this.isEmpty()){
            x = Top.value;
            Top = Top.next;
        }
        return x;
    }

    public int peak() {
        return Top.value;
    }

    public boolean isEmpty() {
        return Top == null;
    }

    public int size() {
        int size = 0;
        Item p = Top;
        while (p != null) {
            size++;
            p = p.next;
        }
        return size;
    }



    public static void main(String[] args) {
        StackADT stack1 = new StackADT();
        System.out.println("New StackADT initialised...");
        System.out.println("Checking if empty: "+stack1.isEmpty());
        System.out.println("Adding some items...");
        stack1.push(1);
        System.out.println("1 added");
        stack1.push(64);
        System.out.println("64 added");
        stack1.push(256);
        System.out.println("256 added");
        System.out.println("Checking size - stack size: "+stack1.size());
        System.out.println("peak top of the stack: " +stack1.peak());
        System.out.println("Popping the top of the stack: "+ stack1.pop());
        System.out.println("Checking size - stack size: "+stack1.size());
        System.out.println("Popping the top of the stack: "+ stack1.pop());
        System.out.println("Checking size - stack size: "+stack1.size());
        System.out.println("Popping the top of the stack: "+ stack1.pop());
        System.out.println("Checking size - stack size: "+stack1.size());
        System.out.println("Popping the top of the stack: "+ stack1.pop());
        System.out.println("Checking size - stack size: "+stack1.size());
    }
}
