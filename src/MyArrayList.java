
public class MyArrayList {
    private Object[] array;
    private int defaultCapacity = 10;
    private int size;

    public MyArrayList() {
        array = new Object[defaultCapacity];
        size = 0;
    }

    public void add(Object element) {
        if (size == array.length) {
            resize();
        }

        array[size] = element;
        size++;
    }

    private void resize() {
        int newCapacity = array.length * 2;
        Object[] newArray = new Object[newCapacity];

        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            return array[index];
        }
    }

    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        array[size - 1] = null;
        size--;
    }

}

