
import java.util.*;
public class Day9_SquarerootFloor_bs {
    public static int binarysearch(int l,int h,int key,int floor){
        int mid=(l+h)/2;
        if(l<=h){
            if(key==(mid*mid)){
                floor=mid;
                return floor;}
            if((mid*mid)<key){
                floor=mid;
                return binarysearch(mid + 1, h,key,floor);
            }
            if((mid*mid)>key){
                return binarysearch(l,mid-1,key,floor);
            }}
        return floor;



    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        System.out.println(binarysearch(0,(key/2)-1,key,-1));

    }
}