public class ListNode <E>{//Внутренний класс.
    E val;
    ListNode next;
    ListNode prev;
    //Ссылки следующие и предыдущие узлы.


    ListNode(E val) {//Конструктор класс ListNode.
        this.val=val;
        this.next = null;
        this.prev=null;
    }
}
