import java.util.*;
public class Day4_Patterns {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println();
            for(int j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
        }
    }
}
