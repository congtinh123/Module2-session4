package Exercise3;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        // Tạo mảng 100,000 số ngẫu nhiên
        int[] array = new int[100000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000000);
        }

        // Tạo đối tượng StopWatch và đo thời gian thực thi của thuật toán sắp xếp chọn
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        selectionSort(array);
        stopWatch.stop();

        // Hiển thị thời gian đã trôi qua theo millisecond
        System.out.println("Thời gian thực thi của thuật toán sắp xếp chọn: " + stopWatch.getElapsedTime() + " milliseconds");
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Hoán đổi phần tử nhỏ nhất với phần tử đầu tiên
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
