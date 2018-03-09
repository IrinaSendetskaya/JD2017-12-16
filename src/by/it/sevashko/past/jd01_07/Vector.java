package by.it.sevashko.jd01_07;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vector extends AbstractVar {

    private double[] value;

    Vector(double[] value) {
        this.value = new double[value.length];
        System.arraycopy(value, 0, this.value, 0, value.length);
    }

    Vector(Vector vector){
        this.value = new double[vector.value.length];
        System.arraycopy(vector.value, 0, this.value, 0, value.length);
    }

    Vector(String strVector){
        Pattern pattern = Pattern.compile("-?[0-9]+\\.?[0-9]*");
        Matcher matcher = pattern.matcher(strVector);
        ArrayList<Double> array = new ArrayList<>();
        while (matcher.find()){
            Double item = Double.parseDouble(matcher.group());
            array.add(item);
        }
        this.value = new double[array.size()];
        for (int i = 0; i < this.value.length; i++) {
            this.value[i] = array.get(i);
        }

        // another version
        /*strVector = strVector.substring(1, strVector.length()-1);
        Pattern pattern = Pattern.compile("[ ,]+");
        String[] vectorArray = pattern.split(strVector);
        this.value = new double[vectorArray.length];
        for (int i = 0; i < vectorArray.length; i++) {
            this.value[i] = Double.parseDouble(vectorArray[i]);
        }*/
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append('{');
        for (int i = 0; i < value.length; i++) {
            if (i > 0) result.append(", ");
            result.append(value[i]);
        }
        result.append('}');
        return result.toString();
    }
}
