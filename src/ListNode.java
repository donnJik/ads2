public class ListNode {//Внутренний класс.
    int val;
    ListNode next;
    ListNode prev;
    //Ссылки следующие и предыдущие узлы.


    ListNode(int val) {//Конструктор класс ListNode.
        this.val=val;
        this.next = null;
        this.prev=null;
    }
}
