package by.it.sevashko.jd01_11;

import java.util.*;
import java.util.function.UnaryOperator;

public class ListA<T> implements List<T>{

    private T[] elements = (T[]) new Object[]{};
    private int size = 0;

    @Override
    public boolean add(T t) {
        if (size == elements.length)
            elements=Arrays.copyOf(elements,elements.length+1);
        elements[size] = t;
        size++;
        return true;
    }

    @Override
    public T remove(int index) {
            T deleted = elements[index];
        System.arraycopy(elements, index + 1, elements, index, size - 1 - index);
        size = size - 1;
        return deleted;
    }

    @Override
    public T get(int index) {
        return elements[index];
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append('[');
        for (int i = 0; i < size; i++) {
            if (i > 0) result.append(", ");
            result.append(elements[i]);
        }
        result.append(']');
        return result.toString();
    }

    @Override
    public T set(int index, T element) {
        T currentElement = elements[index];
        elements[index] = element;
        return currentElement;
    }

    @Override
    public void add(int index, T element) {
        if (size==elements.length)
            elements=Arrays.copyOf(elements,elements.length+1);
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        if (size + c.size() > elements.length)
            elements = Arrays.copyOf(elements,elements.length + c.size());
        for (T e : c){
            elements[size] = e;
            size++;
        }
        return true;
    }

    public boolean addAll(List<? extends T> c) {
        if (size + c.size() > elements.length)
            elements = Arrays.copyOf(elements,elements.length + c.size());
        for (int i = 0; i < c.size(); i++) {
            elements[size] = c.get(i);
            size++;
        }
        return true;
    }

    @Override
    public boolean contains(Object o) {
        if (o == null){
            for (int i = 0; i < size; i++) if (elements[i] == null) return true;
        }
        else for (int i = 0; i < size; i++) if (o.equals(elements[i])) return true;

        return false;
    }

    @Override
    public Object[] toArray() {
        return elements;
    }

    @Override
    public int indexOf(Object o) {
        if (o == null){
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) return i;
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])) return i;
            }
        }
        return -1;
    }

    @Override
    public boolean remove(Object o) {
        if (o == null){
            for (int i = 0; i < size; i++) {
                if (elements[i] == null){
                    System.arraycopy(elements, i + 1, elements, i, size - 1 - i);
                    size = size - 1;
                    return true;
                }

            }
        } else{
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])){
                    System.arraycopy(elements, i + 1, elements, i, size - 1 - i);
                    size = size - 1;
                    return true;
                }

            }
        }
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        if (size + c.size() > elements.length)
            elements = Arrays.copyOf(elements,elements.length + c.size());
        size = size +c.size();
        for (int i = size - 1; i >= index + c.size(); i--) {
            elements[i] = elements[i - c.size()];
        }
        for (T aC : c) {
            elements[index] = aC;
            index++;
        }
        return true;
    }

    public boolean addAll(int index, List<? extends T> c) {
        if (size + c.size() > elements.length)
            elements = Arrays.copyOf(elements, c.size() + size);
        size = size + c.size();
        for (int i = size - 1; i >= index + c.size(); i--) {
            elements[i] = elements[i - c.size()];
        }
        for (int i = 0; i < c.size(); i++) {
            elements[index] = c.get(i);
            index++;
        }
        return true;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }



    @Override
    public void replaceAll(UnaryOperator<T> operator) {

    }

    @Override
    public void sort(Comparator<? super T> c) {

    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }



    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }


    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }



    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }



    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
