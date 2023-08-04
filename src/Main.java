public class Main {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(5);
        linkedList.addNode(3);
        linkedList.addNode(7);
        linkedList.addNode(12);
        linkedList.addNode(5);
        linkedList.addNode(5);
        linkedList.addNode(5);
        linkedList.printList();
        //System.out.println(linkedList.size());
       // System.out.println(linkedList.get(4));
       // linkedList.remove(3);
        linkedList.printList();

        MyArrayList arrayList= new MyArrayList();
        arrayList.addElement(40);
        arrayList.addElement(44);
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));
        arrayList.delete(0);
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));
    }
}