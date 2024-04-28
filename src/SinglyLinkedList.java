class Node{
    public int val ;
    public Node next ;

    Node(int x){
        val = x; 
    }
}


public class SinglyLinkedList {
    Node head ; 

    SinglyLinkedList() {
        
    }

    /*
     * get the head.
     * get next until index.
     * return value.
    
     * if index not found then return -1.
   */
    public int get(int index) {
        Node current = head  ;
        int currentPosition = 0  ;

        /**
         * for loop from 0 to index:
         *      if current node position == index then return value
         *      else get next node 
         *
         * if not found:
         *  return -1  
         * 
         * */ 
        while(current != null) {
            if(currentPosition == index) {
                return current.val ;
            }
            
            currentPosition = currentPosition + 1 ;
            current = current.next ; 

        }

        return -1;

    }
    public void addAtTail(int val){
        Node current = head ;
        Node addedNode = new Node(val);

        while(current.next != null){
            current = current.next;
        }
        current.next = addedNode;

    }

    

     public void addAtHead(int val) {
        Node newNode = new Node(val);
        Node temp ;
        temp = head ;
        head = newNode;
        newNode.next = temp;



     }



     public void addAtIndex(int index, int val) {
        Node addedNode = new Node(val);
        Node current = head ;
        int currentPosition = 0 ;

         while(current != null) {
             if(currentPosition == index) {
                  Node temp ;
                  if(current.next == null){
                      addAtTail(val);
                  }
                  temp = current.next;
                  current.next = addedNode ;
                  addedNode.next = temp;

             }

             currentPosition = currentPosition + 1 ;
             current = current.next ;

         }


       }





     public void deleteAtIndex(int index) {
         Node current = head;

         int currentPosition = 0  ;
         while(current != null) {
             if(currentPosition == index-1) {
                 current.next = current.next.next;
             }

             currentPosition = currentPosition + 1 ;
             current = current.next ;

         }



     }

}