package Exercise9;
import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phoneNumber;

    // Constructor không tham số
    public Student() {
    }

    // Constructor có tham số
    public Student(String id, String name, int age, String gender, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Getter and Setter cho các thuộc tính
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

     // Phương thức inputData để nhập thông tin học sinh
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        id = scanner.nextLine();
        System.out.print("Enter Student Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Student Age: ");
        age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Student Gender: ");
        gender = scanner.nextLine();
        System.out.print("Enter Student Address: ");
        address = scanner.nextLine();
        System.out.print("Enter Student Phone Number: ");
        phoneNumber = scanner.nextLine();
    }

    // Phương thức displayData để hiển thị thông tin học sinh
    public void displayData() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Gender: " + gender);
        System.out.println("Student Address: " + address);
        System.out.println("Student Phone Number: " + phoneNumber);
    }

}
