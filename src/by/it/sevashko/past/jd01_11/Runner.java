package by.it.sevashko.jd01_11;

public class Runner {

    public static void main(String[] args) {
        ListA<Integer> array = new ListA<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        System.out.println(array);
        System.out.println(array.get(2));
        array.remove(2);
        System.out.println(array);
        array.add(2,3);
        System.out.println(array);
        System.out.println(array.set(2,7));
        System.out.println(array);
        ListA<Integer> array1 = new ListA<>();
        array.add(8);
        array.add(9);
        array.add(10);
        array.add(11);
        array.addAll(array1);
        System.out.println(array);
        System.out.println(array.contains(10));
        ListA<Integer> array2 = new ListA<>();
        array2.add(5);
        array2.add(6);
        array2.add(7);
        array.addAll(4, array2);
        System.out.println(array);
        array.remove((Integer) 8);
        System.out.println(array);
    }
}
