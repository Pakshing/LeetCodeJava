package Midterm;

public class Midterm {
    public static void main(String[] args) {
        int[] originalArr = {1, 2, 3, 4};
        int[] copyArr = originalArr;
        copyArr[0] = 200;

        System.out.println(originalArr[0]);
    }
}
