import java.util.*;
//SELECTION SORT
public class Day6_SelectionSort {
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");}}
    public static void main(String[] args) {
        int i,j,temp;
        int arr[]={1,8,5,3,77,0,-1,101,-3};
        for(i=0;i<arr.length-1;i++){
            int min=i;
            for(j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;}}
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;}
        printarray(arr);}}