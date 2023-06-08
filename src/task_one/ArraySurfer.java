package task_one;

import java.util.ArrayList;

public class ArraySurfer<T> {
    private ArrayList<T> array;

    public ArraySurfer() {
        this.array = new ArrayList<>();
    }

    public void add(T element) {
        array.add(element);
    }

    public void remove(T element) {
        array.remove(element);
    }

    public void set(int index, T element) {
        array.set(index, element);
    }



    @Override
    public String toString() {
        return array.toString();
    }
}
