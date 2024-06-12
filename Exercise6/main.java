package Exercise6;

public class main {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        System.out.println("Giá trị ban đầu của myString: " + myObject.getMyString());
        myObject.setMyString("Hello, World!");
        System.out.println("Giá trị mới của myString: " + myObject.getMyString());
    }
}

