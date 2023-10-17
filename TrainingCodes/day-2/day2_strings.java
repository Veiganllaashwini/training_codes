import java.util.*;
public class day2_strings {
    public static void main(String[] args) {
        String s;
        int flag=0;

        Scanner sc=new Scanner(System.in);
        s=sc.next();
        for(int i=0;i<s.length()/2;i++){
if(s.charAt(i)!=s.charAt(s.length()-i-1)){
    flag=1;
}
        }
        if(flag==1){
            System.out.println("noo");
        }
else
            System.out.println("yess");
    }
}
