
import java.util.*;
public class Day9_TarrgetSum_LRPointers {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int target=sc.nextInt();
            int left=0;
            int flag=0;
            int right=arr.length-1;
            for(int i=0;i<n;i++) {
                if (arr[left] + arr[right] == target) {
                    flag=1;
                    break;
                } else if ((arr[left] + arr[right]) < target) {
                    left = left + 1;
                } else if ((arr[left] + arr[right]) > target) {
                    right = right - 1;
                }
            }
            if(flag==1)
                System.out.println("Target found!!");
            else
                System.out.println("Target not found!!");
        }

    }
