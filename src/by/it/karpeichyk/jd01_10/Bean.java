package by.it.karpeichyk.jd01_10;

/**
 * Created by user on 11.01.2018.
 */

public class Bean {

    @Param(b=9)
   static double sum(int a, int b){
        return  a+b;
    }
    @Param(a=3,b=4)
    double max(int a, int b){
        return  Math.max(a,b);
    }
    @Param(a=3,b=4)
 static    double min(int a, int b){
        return  Math.min(a,b);
    }
    double avg (int a, int b){
        return  (a+b)/2.0;
    }

}
