package exercise2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a:");
        double a=scanner.nextDouble();
        System.out.println("Enter b:");
        double b=scanner.nextDouble();
        System.out.println("Enter c:");
        double c=scanner.nextDouble();
        QuadraticEquation getDiscriminant=new QuadraticEquation(a,b,c);
        double delta=getDiscriminant.getDiscriminant();
        if(delta>0){
            double x1=(-b+Math.sqrt(delta))/(2*a);
            double x2=(-b-Math.sqrt(delta))/(2*a);
            System.out.println("Phuong trinh co hai nghiem: "+x1+", "+x2);
        }else if(delta==0){
            double x=-b/(2*a);
            System.out.println("phuong trinh co 1 nghiem: "+x);
        }else{
            System.out.println("phuong trinh vo nghiem!");
        }
    }
}
