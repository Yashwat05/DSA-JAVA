import java.util.*;

public class CountSort {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int n = sc.nextInt();
        int arr[] = new int[n];

        input(arr, n);
    }

    static void input(int arr[], int n) {
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        maxelement(arr, n);
    }

    static void maxelement(int arr[], int n) {
        int max = arr[0]; 
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) max = arr[i];
        }

        cs(arr, n, max);
    }

    static void cs(int arr[], int n, int max) {
        int count[] = new int[max + 1];

        // Count occurrences
        for (int i = 0; i < n; i++) {
            count[arr[i]] += 1;
        }

        // Rebuild sorted array
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i]-- > 0) {
                arr[index++] = i;
            }
        }

        display(arr, n);
    }

    static void display(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
