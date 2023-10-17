public class Day3_BitManipulation1{
    //GET BIT-knowing if the bit at given position is zero or one
    public static void main(String[] args) {
        int n=5;
        int pos=3;
        if(((1<<pos)&n)==0)
            System.out.println("Zero");
        else
            System.out.println("One");
    }
}
