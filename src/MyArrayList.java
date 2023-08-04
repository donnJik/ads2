

public class MyArrayList implements MyList{//created a class MyArrayList and implemented List interface.
    private int[] arr;//created var arr.
    private int size; //created size var.

    MyArrayList(){//Конструктор для класс MyArrayList.
        this.arr = new int[5];//Присваивается размер 5, массиву.
        this.size = 0;//Изначальное количество элементов в массиве 0.
    }
    public void addElement(int element){
        if(size == arr.length) {//Проверяется достаточно ли большой массив для добавления нового элемента.
            increaseBuffer();//Если массив полон, выполняется метод IncreaseBuffer.
        }
        arr[size++] = element;//Если массив не полон, элемент записывется в массив.
    }
    private void increaseBuffer(){//Метод для увелечения массива.
        int[] newArr = new int[arr.length * 2];//Создается новый массив с удвоенным размером.
        for(int i=0; i<arr.length; i++){
            newArr[i] = arr[i];//Элементы копируется со старого массива в новый.
        }
        arr = newArr;
    }
    public int getElement(int index){//Метод для возвращения элемента массива под заданным индексом.
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
        checkIndex(index);
        return arr[index];
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

    private void checkIndex(int index){//Метод для проверки индекса.
        if(index<0||index>size){//Если заданный индекс меньше 0 или больше размера массива, будет брошено исключени.
            throw new IndexOutOfBoundsException("Index does not exist");
        }
    }
    public void delete(int index){//Метод для удаления элемента под заданным индексом в массиве.
        checkIndex(index);//Прверка индекса.
        for(int i=index+1; i<size; i++){//Сдвигает все элементы на лево на один индекс и удаляет элемент под заданным индексом.
            arr[i-1]= arr[i];
        }
        size--;
    }
}