package stack;

import java.util.Arrays;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            stack.push(arr[i]);
        }
        int[] newArr = new int[n];
        for (int i = 0; i < n; i++) {
            newArr[i] = stack.pop();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));


    }
}








