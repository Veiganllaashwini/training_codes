import java.util.*;
import java.util.Scanner;

class Day6_Palindrome
{
    public static void main(String args[])
    {
        String str, rev = "";
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();

        int length = str.length();

        for ( int i = length - 1; i >= 0; i-- )
            rev = rev + str.charAt(i);

        if (str.equals(rev))
            System.out.println("Yes,A Palindrome!");
        else
            System.out.println("Not a Palindrome");

    }
}