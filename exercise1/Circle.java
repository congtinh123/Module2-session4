package exercise1;

public class Circle {
    //Attribute:
    private double  radius;
    
    //constructor:
    public Circle(){}

    public Circle(double radius){
    this.radius=radius;
}
    //getter-setter:
    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }

    //Method:
    public double perimeter(){
        return 2*radius*3.14;
    }

    public double acreage(){
        return Math.pow(radius, 2)*3.14;
    }

    //Method displayData
   @Override
   public String toString(){
    return "Circle [radius="+ radius + "]";
   }
}
