

public class MyArrayList implements MyList{//created a class MyArrayList and implemented List interface.
    private int[] arr;//created var arr.
    private int size; //created size var.

    MyArrayList(){//конструктор для класс MyArrayList.
        this.arr = new int[5];//Присваивается размер 5, массиву.
        this.size = 0;//Изначальное количество элементов в массиве 0.
    }
    public void addElement(int element){
        if(size == arr.length) {
            increaseBuffer();
        }
        arr[size++] = element;
    }
    private void increaseBuffer(){
        int[] newArr = new int[arr.length * 2];
        for(int i=0; i<arr.length; i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
    public int getElement(int index){
        checkIndex(index);
        return arr[index];
    }

    public int getSize(){
        return size;
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

    public void clear(){
        this.arr = new int[5];
        this.size = 0;
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

    private void checkIndex(int index){
        if(index<0||index>size){
            throw new IndexOutOfBoundsException("Index does not exist");
        }
    }
    public void delete(int index){
        checkIndex(index);
        for(int i=index+1; i<size; i++){
            arr[i-1]= arr[i];
        }
        size--;
    }
}