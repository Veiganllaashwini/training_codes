import java.util.*;

public class Day12_ColorSort {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int right=n-1;
            int left=0;
            int i=0;
            while(i<=right){
                if(arr[i]==0){
                    int temp=arr[i];
                    arr[i]=arr[left];
                    arr[left]=temp;
                    left+=1;
                    i+=1;
                }
                else if(arr[i]==1){
                    i+=1;
                }
                else if(arr[i]==2){
                    int temp1=arr[i];
                    arr[i]=arr[right];
                    arr[right]=temp1;
                    right-=1;
                }
            }
            for(i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
        }

}
