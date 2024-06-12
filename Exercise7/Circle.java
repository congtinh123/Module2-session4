package Exercise7;

// src/Circle.java
public class Circle {
    // Thuộc tính private với giá trị khởi tạo
    private double radius = 1.0;
    private String color = "red";

    // Hàm tạo không tham số
    public Circle() {}

    // Hàm tạo có tham số radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Phương thức public để lấy giá trị của radius
    public double getRadius() {
        return radius;
    }

    // Phương thức public để tính diện tích của hình tròn
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

