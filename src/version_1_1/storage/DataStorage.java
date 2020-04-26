package version_1_1.storage;

import version_1_1.model.Book;

public class DataStorage<T> {

//    private Book[] array;
//    private int size = 0;
//
//    public DataStorage(int length) {
//        array = new Book[length];
//    }
//
//    public DataStorage() {
//        array = new Book[16];
//    }
//
//    public void add(T value)throws NullPointerException {
//        if (value != null) {
//            if (size == array.length) {
//                extend();
//            }
//            array[size++] = (Book) value;
//        } else {
//           throw new NullPointerException();
//        }
//    }
//
//    private void extend() {
//        Book[] temp = new Book[array.length + 10];
//        System.arraycopy(array, 0, temp, 0, array.length);
//        array = temp;
//    }
//
//    public void print() {
//        for (int i = 0; i < size; i++) {
//            System.out.println(array[i]);
//        }
//    }
//
//    public T get(int index){
//        return (T) array[index];
//    }
//
//    public int getSize(){
//        return size;
//    }
//
//    public Object[] getArray(){
//        return array;
//    }
//
//    public boolean isEmty(){
//        return size==0;
//    }




}
