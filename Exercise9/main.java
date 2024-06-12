package Exercise9;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       Student[] students = new Student[100];
        int studentCount = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Hiển thị danh sách tất cả học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Sửa thông tin học sinh dựa vào mã học sinh");
            System.out.println("4. Xoá học sinh");
            System.out.println("5. Thoát");
            System.out.print("Chọn một tùy chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    // Hiển thị danh sách tất cả học sinh
                    System.out.println("\nDanh sách tất cả học sinh:");
                    if (studentCount == 0) {
                        System.out.println("Không có học sinh nào trong danh sách.");
                    } else {
                        for (int i = 0; i < studentCount; i++) {
                            students[i].displayData();
                            System.out.println();
                        }
                    }
                    break;
                case 2:
                    // Thêm mới học sinh
                    if (studentCount < students.length) {
                        Student newStudent = new Student();
                        newStudent.inputData();
                        students[studentCount] = newStudent;
                        studentCount++;
                        System.out.println("Đã thêm học sinh mới.");
                    } else {
                        System.out.println("Danh sách học sinh đã đầy.");
                    }
                    break;
                case 3:
                    // Sửa thông tin học sinh dựa vào mã học sinh
                    System.out.print("Nhập mã học sinh cần sửa: ");
                    String editId = scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < studentCount; i++) {
                        if (students[i].getId().equals(editId)) {
                            students[i].inputData();
                            System.out.println("Đã cập nhật thông tin học sinh.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy học sinh với mã: " + editId);
                    }
                    break;
                case 4:
                    // Xoá học sinh
                    System.out.print("Nhập mã học sinh cần xoá: ");
                    String deleteId = scanner.nextLine();
                    found = false;
                    for (int i = 0; i < studentCount; i++) {
                        if (students[i].getId().equals(deleteId)) {
                            // Dịch chuyển các phần tử phía sau lên trước
                            for (int j = i; j < studentCount - 1; j++) {
                                students[j] = students[j + 1];
                            }
                            students[studentCount - 1] = null;
                            studentCount--;
                            System.out.println("Đã xoá học sinh.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy học sinh với mã: " + deleteId);
                    }
                    break;
                case 5:
                    // Thoát
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }
    }
}
