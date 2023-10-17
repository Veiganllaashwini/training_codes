import java.util.*;
public class Day2_templeprblm{
    public static void main(String[] args) {
        int n;
        try{
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            if(n<0)
                throw  new Exception();
            System.out.println(21-n);
        }
        catch(Exception e){
            System.out.println("invalid input!!");

        }
    }
}
