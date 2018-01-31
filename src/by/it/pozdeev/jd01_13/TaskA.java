package by.it.pozdeev.jd01_13;

import java.util.HashMap;

public class TaskA {
    public static void main(String[] args) {
        try {

            if (Math.random() > 0.5)
                new HashMap<String, String>(null);
            else Integer.parseInt("привет");
        } catch (NullPointerException | NumberFormatException e) {
            String name = e.getClass().getName();
            System.out.println(" name: " + name);
            String ourname = TaskA.class.getName();
            StackTraceElement[] stackTraceElements = e.getStackTrace();
            for (StackTraceElement element : stackTraceElements) {
                String className = element.getClassName();
                int lineNumber = element.getLineNumber();
                if (ourname.equals(className)) {
                    System.out.println("class: " + className);
                    System.out.println(" line: " + lineNumber);
                    break;
                }


            }
        }
    }
}



