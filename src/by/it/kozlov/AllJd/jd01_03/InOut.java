package by.it.kozlov.jd01_03;

public class InOut {

    public static double[] getArray(String line) {
        line = line.trim();
        String[] elemString = line.split(" ");
        double[] res = new double[elemString.length];
        for (int i = 0; i < elemString.length; i++) {
            res[i] = Double.parseDouble(elemString[i]);
        }
        return res;
    }

    public static void printArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(double[] arr, String name, int columnCount) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s[% -3d]=%-10.5f ", name, i, arr[i]);
            if ((i + 1) % columnCount == 0 || i == arr.length - 1) System.out.println();
        }
    }
}
