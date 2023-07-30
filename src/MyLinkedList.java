public class MyLinkedList<E> implements MyList{
    ListNode head;
    ListNode tail;
    int size;
    MyLinkedList(int size) {
        this.head = null;
        this.tail=null;
        this.size=size;
    }
    public void addNode(int val) {
        ListNode newNode = new ListNode(val);
        if (this.head==null){
            this.head=newNode;
            this.tail=newNode;
            return;
        }
        else {
            ListNode currentNode= this.head;
            int i=0;
            while(currentNode.next!= null){
                currentNode=currentNode.next;
            }
            currentNode.next=newNode;
        }size++;

    }
    // Print the linked list
    public void printList() {
        ListNode currentNode = this.head;
        while (currentNode != null) {
            System.out.print(currentNode.val + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public void add(Object item) {

    }



    @Override
    public void add(Object item, int index) {

    }

    @Override
    public boolean remove(Object item) {
        return false;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        if (index >= 0 && index < size) {
            ListNode currentNode = this.head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
            return currentNode.val;
        } else throw new IndexOutOfBoundsException("Index is out of bounds");
    }


    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public void sort() {

    }
}