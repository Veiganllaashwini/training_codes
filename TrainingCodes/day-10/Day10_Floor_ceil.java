
import java.util.*;
public class Day10_Floor_ceil {


        // Solution
        public static int[] floorAndCeil(int[] arr, int n,
                                         int x)
        {

            int[] result = new int[2];

            int low = 0, high = n - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] > x) {
                    high = mid - 1;
                }
                else if (arr[mid] < x) {
                    low = mid + 1;
                }
                else {
                    Arrays.fill(result, arr[mid]);
                    return result;
                }
            }

            // if loop breaks
            result[0] = (high == -1) ? -1 : arr[high];
            result[1] = (low == arr.length) ? -1 : arr[low];

            return result;
        }

        // Driver
        public static void main(String[] args)
        {

            int[] arr = { 5, 6, 8, 9, 6, 5, 5, 6 };
            int n = arr.length;
            int x = 7;

            int[] result = floorAndCeil(arr, n, x);
            System.out.println("floor is " + result[0]);
            System.out.println("ceil is " + result[1]);
        }

}
