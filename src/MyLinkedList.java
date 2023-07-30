public class MyLinkedLis  implements MyList {
    private class Node{
        E element;
        Node next;
        Node prev;

        Node(E element){
            this.element=element;
            this.next=null;
        }
    }

}
