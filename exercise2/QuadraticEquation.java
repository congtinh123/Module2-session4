package exercise2;

public class QuadraticEquation {
//Attribute:
private double a;
private double b;
private double c;
//constructor:
public QuadraticEquation(){}
public QuadraticEquation(double a,double b,double c){
    this.a=a;
    this.b=b;
    this.c=c;
}
//getter-setter:
public double getA(){
    return a;
}
public double getB(){
    return b;
}
public double getC(){
    return c;
}
public double getDiscriminant(){
    return Math.pow(b, 2)-(4*a*c);
}

}
