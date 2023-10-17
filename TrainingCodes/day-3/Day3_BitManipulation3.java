public class Day3_BitManipulation3 {
  //  CLEAR BIT-setting the bit at given position to zero
    public static void main(String[] args) {
int n=5;
int pos=2;
        System.out.println((~(1<<pos)&n));
    }
}
