package exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("1:calculate acreage");
        System.out.println("2:calculate perimeter");
        System.out.println("Enter Choice:");
        int choice =Integer.parseInt(scanner.nextLine());
        switch(choice){
            case 1:
            System.out.println("Enter Radius: ");
            double radius1 =Double.parseDouble(scanner.nextLine());
            Circle circleAcreage = new Circle(radius1);
            System.out.println("Acreage: "+ circleAcreage.acreage());
            break;
            case 2:
            System.out.println("Enter Radius: ");
            double radius2 = Double.parseDouble(scanner.nextLine());
            Circle circlePerimeter = new Circle(radius2);
            System.out.println("Perimeter: "+circlePerimeter.perimeter());
            break; 
        }
    }
}
