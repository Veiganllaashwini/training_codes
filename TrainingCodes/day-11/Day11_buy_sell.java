import java.util.*;
public class Day11_buy_sell{//This is a greedy approach
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int maxprofit = 0;
        int buy=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<buy){
                buy=arr[i];
            }
            else if((arr[i]-buy)>maxprofit){
                maxprofit=arr[i]-buy;
            }
        }
        System.out.println(maxprofit);
    }
}