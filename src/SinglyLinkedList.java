public class SinglyLinkedList {
    Node head;

    SinglyLinkedList() {

    }

    /*
     * get the head.
     * get next until index.
     * return value.

     * if index not found then return -1.
     */

    /*
     *Analysis of the get() method ;
     * while-loop-condition (current != null) implies that the loop will iterate till the last element of the list with shifted currentPosition to the empty Tail ;
     * the if-Condition (currentPosition == index ) implies that the condition is skipped until currentPosition == index ;
     * (loop-metaphor : eagle-prey loop )
     * if the current == head == null the get method will return -1 ; in other words if the list is empty ;
     */
    public int get(int index) {
        Node current = head;
        int currentPosition = 0;


        while (current != null) {
            if (currentPosition == index) {
                return current.val;
            }

            currentPosition = currentPosition + 1;
            current = current.next;

        }

        return -1;

    }

    public void addAtTail(int val) {
        Node current = head;
        Node addedNode = new Node(val);

        while (current.next != null) {
            current = current.next;
        }
        current.next = addedNode;

    }


    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;


    }


    //iterate to index .
    // adjust pointers.
    // special cases.
    public void addAtIndex(int index, int val) {
        if (head == null) {
            addAtHead(val);
            return;
        }
        Node newNode = new Node(val);
        int currentPosition = 0;
        Node current = head;
        Node previous = null;

        while (currentPosition != index) {
            currentPosition = currentPosition + 1;
            previous = current;
            current = current.next;
        }

        previous.next = newNode;
        newNode.next = current;


    }


    //iterate to index
    // change node(index -1 ) to point to node(index +1 )
    //change node(index) to point to null ;
    public void deleteAtIndex(int index) {
        Node previous = null;
        Node current = head;
        int currentPosition = 0;

        if (head == null) {
            return;
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        while (currentPosition != index && current != null) {
            currentPosition = currentPosition + 1;
            previous = current;
            current = current.next;
        }

        if (current == null) {
            return;
        }

        previous.next = current.next;
        current = null;
    }


}

