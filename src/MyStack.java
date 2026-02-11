public class MyStack<T> {

    private T[] array;
    private int size;

    @SuppressWarnings("unchecked")
    public MyStack() {
        this.array = (T[]) new Object[10];
        this.size = 0;
    }

    public void push(T value) {
        if (size == array.length) {
            resize();
        }
        array[size++] = value;
    }

    public T pop() {
        if (size == 0) {
            return null;
        }

        T value = array[--size];
        array[size] = null;
        return value;
    }

    public T peek() {
        if (size == 0) {
            return null;
        }
        return array[size - 1];
    }

    public int size() {
        return size;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        T[] newArray = (T[]) new Object[array.length * 2];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }
}
