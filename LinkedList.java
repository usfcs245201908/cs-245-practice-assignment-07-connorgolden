public class LinkedList<S> implements List{
    Node head; // head of list

    /* Linked list Node*/
    class Node {
        Object data;
        Node next;
    }

    public LinkedList(){
        head = new Node();
    }

    @Override
    public void add(Object item) {
        if (head.data == null){
            head.data = item;
            return;
        }

        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        Node newNode = new Node();
        newNode.data = item;
        current.next = newNode;
    }

    @Override
    public void add(int pos, Object item) {
        if (head.data == null){
            head.data = item;
            return;
        }
        Node current = head;
        int counter = 0;
        while(current.next != null && counter <= pos) {
            current = current.next;
            counter++;
        }
        Node temp = current.next;

        Node newNode = new Node();
        newNode.data = item;
        newNode.next = temp;
        current.next = newNode;
    }

    @Override
    public Object get(int pos) {
        Node current = head;
        int counter = 0;
        while(current.next != null && counter <= pos) {
            current = current.next;
            counter++;
        }
        return current.data;
    }

    @Override
    public Object remove(int pos) {
        Node current = head;
        int counter = 0;

        while(current.next != null && counter < pos-1) {
            current = current.next;
            counter++;
        }
        Node removed;
        if (current.next != null) {
           removed = current.next;
           Node after = current.next;
           if (after != null) {
               if (current.next.next != null) {
                   current.next = current.next.next;
               } else {
                   current.next = null;
               }
           }
        } else {
            removed = current;
            head = null;
        }
        return removed.data;


    }

    @Override
    public int size() {
        Node current = head;
        int counter = 0;
        if (head == null) {
            return 0;
        }
        if (head.data != null) {
            counter++;
        }
        while(current.next != null) {
            current = current.next;
            counter++;
        }

        return counter;
    }
}
