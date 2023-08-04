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
        System.out.println(linkedList.size());
        System.out.println(linkedList.get(4));
        linkedList.remove(3);
        linkedList.printList();

        MyArrayList arrayList= new MyArrayList();
        arrayList.addElement(40);//Добавляет элемент в массив.
        arrayList.addElement(44);
        System.out.println(arrayList.size());//Возвращает количество элементов.
        System.out.println(arrayList.getElement(0));//Возвращает элемент под 0 индексом.
        arrayList.delete(0);//Удаляет элемент под 0 индексом.
        System.out.println(arrayList.size());//Возвращает количество элементов после удаления жлемента.
        System.out.println(arrayList.getElement(0));//Возвращает элемент под индексом 0 после удаления.
    }
}