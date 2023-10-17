import java.util.*;
public class Day9_PerfectSquare_bs{
    public static int binarysearch(int arr[],int l,int h,int key){
        int mid=(l+h)/2;
        if(l<=h){
            if(key==(arr[mid]*arr[mid])){
                return arr[mid];}
            if((arr[mid]*arr[mid])<key){
                return binarysearch(arr, mid + 1, h, key);
            }
            if((arr[mid]*arr[mid])>key){
                return binarysearch(arr,l,mid-1,key);
            }}
        return 0;


    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        int[] arr=new int[13];
        for(int i=0;i<13;i++){
            arr[i]=i;
        }
        System.out.println(binarysearch(arr,0,12,key));

    }
}
