package code_demo;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {2,4,6,8,9,10,12,22,24};
        System.out.println(" Nhập phần tử muốn tìm kiếm");
        int target = Integer.parseInt(scanner.nextLine());
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Không tìm thấy phần tử trong mảng.");
        } else {
            System.out.println("Phần tử " + target + " được tìm thấy tại vị trí " + result);
        }
    }
}


