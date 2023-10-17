import java.util.*;
public class Day1_neon_number{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rem,count=0,num,sum=0,sq;
        System.out.println("Enter a number");
num=sc.nextInt();
int n=num;
sq=num*num;
        if(n*n==num){
            System.out.println("Neon number");}
        else{
            while(sq>0){
                rem=(sq)%10;
                sum=sum+rem;
                sq=sq/10;
            }
            if(sum!=n){
                System.out.println("Not a neon number");
            }
            else if(sum==n){
                System.out.println("yes,a neon number");
            }
        }

    }
}

