package by.it.karpeichyk.Calc;

//import by.it.karpeichyk.Var;

/**
 * Created by user on 10.01.2018.
 */
 class Scalar extends Var {
     private double value;

    public Scalar(double value) {this.value=value;}


    @Override
     public Var add(Var other){
         if(other instanceof Scalar){
             return new Scalar(this.value+((Scalar) other).value);
         }
         else return other. add(this);
     }
     @Override
    public Var mul (Var other){
        if(other instanceof Scalar){
            return new Scalar(this.value*((Scalar) other).value);
        }
        else return other. mul(this);
    }
    @Override
    public Var div(Var other){
        if(other instanceof Scalar){
            return new Scalar(this.value/((Scalar) other).value);
        }
        else return other. div(this);
    }
    @Override
    public Var sub(Var other){
        if(other instanceof Scalar){
            return new Scalar(this.value-((Scalar) other).value);
        }
        else{
            Scalar minus=new Scalar(-1);
            return other. sub(this).mul(minus);}
    }
    Scalar (Scalar other){this.value=other.value;}
Scalar (String string){
        this.value=Double.parseDouble(string);
}
    @Override
    public  String toString(){return Double.toString(value);}



}
