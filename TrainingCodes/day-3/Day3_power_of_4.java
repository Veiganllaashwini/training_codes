import java.util.*;
public class Day3_power_of_4{
    public static void main(String[] args) {
        long n;
        int flag=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        for(int i=1;i<100;i++){
            if(Math.pow(4,i)==n || Math.pow(-4,i)==n){
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("YES,a power of 4!!");
        else
            System.out.println("Not a power of 4!!");
    }
}