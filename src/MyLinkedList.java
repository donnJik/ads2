import java.util.Collection;

public class MyLinkedList<E> implements MyList<E> {
    ListNode head;//Ссылка на первый узел.
    ListNode tail;//Ссылка на последний узел.
    int size;//Количество элементов в списке.

    MyLinkedList(int size) {
        this.head = null;
        this.tail = null;
        this.size = size;
    }

    public void addNode(int val) {
        ListNode newNode = new ListNode(val);//Создается новый узел с указанным значением.
        if (this.head == null) {//Если список пуст, узел будет ежинственным в списке.
            this.head = newNode;
            this.tail = newNode;
            return;
        } else {
            ListNode currentNode = this.head;//Если же список не пуст, текущий узел будет равен первому узлу.
            int i = 0;
            while (currentNode.next != null) {//
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        size++;

    }


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
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы списка");
        }

        ListNode<E> removedNode;
        if (index == 0) {
            // Removing the head node
            removedNode = head;
            head = head.next;
            if (head == null) {
                tail = null; // Если список становится пустым после удаления головы, обновляем ссылку на хвост
            } else {
                head.prev = null; // Обновляем ссылку на предыдущий узел новой головы
            }
        } else if (index == size - 1) {
            // Removing the tail node
            removedNode = tail;
            tail = tail.prev;
            tail.next = null; // Обновляем ссылку на следующий узел нового хвоста
        } else {
            // Removing a node in the middle of the list
            ListNode currentNode;
            if (index <= size / 2) {
                currentNode = head;
                for (int i = 0; i < index; i++) {
                    currentNode = currentNode.next;
                }
            } else {
                currentNode = tail;
                for (int i = size - 1; i > index; i--) {
                    currentNode = currentNode.prev;
                }
            }

            removedNode = currentNode;
            currentNode.prev.next = currentNode.next;
            currentNode.next.prev = currentNode.prev;
        }

        size--;
        return removedNode.val;
    }


    @Override
    public void clear() {
    }
    @Override
    public E get(int index) {
        if (index >= 0 && index < size) {
            ListNode<E> currentNode = this.head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
            return currentNode.val;
        } else {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
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

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы списка");
        }

        if (c == null || c.isEmpty()) {
            return false;
        }

        int newSize = size + c.size();

        if (index == size) {
            ListNode<E> currentNode = tail;

            for (E element : c) {
                ListNode<E> newNode = new ListNode<>(element);
                currentNode.next = newNode;
                newNode.prev = currentNode;
                tail = newNode;
                currentNode = newNode;
                size++;
            }
        } else {
            ListNode<E> currentNode;
            if (index <= size / 2) {
                currentNode = head;
                for (int i = 0; i < index; i++) {
                    currentNode = currentNode.next;
                }
            } else {
                currentNode = tail;
                for (int i = size - 1; i > index; i--) {
                    currentNode = currentNode.prev;
                }
            }

            for (E element : c) {
                ListNode<E> newNode = new ListNode<>(element);
                newNode.next = currentNode.next;
                if (currentNode.next != null) {
                    currentNode.next.prev = newNode;
                }
                currentNode.next = newNode;
                newNode.prev = currentNode;
                currentNode = newNode;
                size++;
            }
        }

        return true;
    }
}