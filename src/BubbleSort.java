import java.util.Arrays;

public class BubbleSort<bubble_sort> {
    static void bubble_sort(int A[], int n) {
        int temp;
        for (int k = 0; k < n - 1; k++) {
            for (int i = 0; i < n - k - 1; i++) {
                if (A[i] > A[i + 1]) {
                    temp = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {

        int arr[] = {5, 7, 9, 3, 5, 1};
        bubble_sort(arr, arr.length);
        System.out.print("First array after sorting "  + Arrays.toString(arr));
        System.out.println();
        int arr2[] = {125, 352, -25, 1000, -1};
        bubble_sort(arr2, arr2.length);
        System.out.print("Second array after sorting " + Arrays.toString(arr2));
    }
}
