package by.it.ikiselev.jd01_10;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class PrintMath {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Class<?> structMath=String.class;
       // structMath.getAnnotation();
        Method[] methods=structMath.getDeclaredMethods();
        for (Method method:methods
             ) {

//            if ((method.getModifiers() & Modifier.STATIC)==Modifier.STATIC);
//            System.out.println(method);
            Class<?>[] params=method.getParameterTypes();
            if (params.length==1 && params[0]==int.class)
                System.out.println(method);
            if (method.getName().equals("valueOf")) {
                String res=(String) method.invoke(null, 123);
                System.out.println(res);
            }
        }
    }
}
