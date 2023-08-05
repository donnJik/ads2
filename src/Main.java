import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

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
        System.out.println(linkedList.get(0));
        linkedList.remove(0);
        linkedList.printList();
        Collection<Integer> collection1= new ArrayList<>(Arrays.asList(22,33,44));
        linkedList.addAll(0,collection1);
        linkedList.printList();


        System.out.println("---------------------------------------------");

        MyArrayList arrayList= new MyArrayList();
        arrayList.addElement(40);//Добавляет элемент в массив.
        arrayList.addElement(44);
        System.out.println(arrayList.size());//Возвращает количество элементов.
        System.out.println(arrayList.getElement(0));//Возвращает элемент под 0 индексом.
        arrayList.delete(0);//Удаляет элемент под 0 индексом.
        System.out.println(arrayList.size());//Возвращает количество элементов после удаления жлемента.
        System.out.println(arrayList.getElement(0));//Возвращает элемент под индексом 0 после удаления.

        Collection<Integer> collection=new ArrayList<>(Arrays.asList(100, 200, 400));
        arrayList.addAll(0,collection);
        System.out.println("Список");
        for(int i=0;i<arrayList.getSize();i++){
            System.out.println(arrayList.getElement(i));
        }
        System.out.println(arrayList.getSize());
    }
}