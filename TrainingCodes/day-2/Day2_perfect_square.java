public class Day2_perfect_square {
    public static void main(String[] args) {
        System.out.println("Perfect Squares from 40-100:");
        for(int i=40;i<=100;i++){
            for(int j=1;j<=i;j++){
                if(j*j==i){
                    System.out.println(i+" ");
                }
                else
                    continue;
            }
        }
    }
}