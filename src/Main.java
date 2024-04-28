public class Main {
    public static void main(String[] args) {
        SinglyLinkedList test = new SinglyLinkedList();
        test.head = new Node(0);
        System.out.println(test.get(0));
        for(int i = 1 ; i < 6 ; i++){
           test.addAtTail(i);
          System.out.println( test.get(i));
        }


        test.deleteAtIndex(3);
        for(int i = 0 ; i < 6 ; i++){

            System.out.println( test.get(i));
        }

        test.addAtHead(3);
        for(int i = 0 ; i < 6 ; i++){

            System.out.println( test.get(i));
        }

        test.addAtIndex(6, 7 );
        for(int i = 0 ; i < 7 ; i++){

            System.out.println( test.get(i));
        }








    }
}