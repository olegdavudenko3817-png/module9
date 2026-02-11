public class MyArrayList<T> {
    private T[] array;
    private int size;

    @SuppressWarnings("unchecked")
    public MyArrayList() {
       this.array = (T[]) new Object[10];
       this.size = 0;

    }

    @SuppressWarnings("unchecked")
    public void add(T value) {
      if (size == array.length) {
          T[] newArray = (T[]) new Object[array.length * 2];
          for(int i = 0; i < array.length; i++){
              newArray[i] = array[i];
          }
          array = newArray;
      }
      array[size] = value;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) return;

        for(int i = index; i < size; i++) {
            array[i] = array[i+1];
        }
        array[--size] = null;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        if(index < 0 || index >= size) return null;
        return array[index];
    }

}
