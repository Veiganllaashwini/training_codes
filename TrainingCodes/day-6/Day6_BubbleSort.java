import java.util.*;
//BUBBLE SORT
public class Day6_BubbleSort{
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");}}
    public static void main(String[] args) {
        int i,j,temp;
        int arr[]={1,8,5,3,77,0,-1};
        for(i=0;i<arr.length-1;i++){
            for(j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;}}}
        printarray(arr);}}
