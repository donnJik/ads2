public class MyLinkedList<E> implements MyList{
    ListNode head;
    ListNode tail;
    int size;
    MyLinkedList(int size) {
        this.head = null;
        this.tail=null;
        this.size=0;
    }
    public void addNode(int val) {
        ListNode newNode = new ListNode(val);
        if (this.head == null) {
            this.head = newNode;
            return;
        }
        ListNode currentNode = this.head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
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
        return size;
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
        return null;
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



