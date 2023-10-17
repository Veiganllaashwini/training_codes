public class Day6_InsertionSort {
        public static void printArray(int A[], int n) {
                for (int i = 0; i < n; i++) {
                        System.out.print(A[i]+" ");
                }
                System.out.println("\n");
        }

        public static void insertionSort(int A[], int n) {
                int key, j;
                // Loop for passes
                for (int i = 1; i <= n - 1; i++) {
                        key = A[i];
                        j = i - 1;
                        // Loop for each pass
                        while (j >= 0 && A[j] > key) {
                                A[j + 1] = A[j];
                                j--;
                        }
                        A[j + 1] = key;
                }
        }

        public static void main(String[] args) {


                int A[] = {12, 54, 65, 7, 23, 9};
                int n = 6;
                printArray(A, n);
                insertionSort(A, n);
                printArray(A, n);
        }
}