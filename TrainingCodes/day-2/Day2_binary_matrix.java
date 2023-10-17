import java.util.*;
public class Day2_binary_matrix {
    public static void main(String[] args) {
        Random r=new Random();
        int onerow_hor_count =0,zerorow_hor_count=0,countone=0,countzero=0,k=0;
        int ver_count_zero=0,countver=0;
        int a[][]=new int[4][4];
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                a[i][j]=r.nextInt(2);
                System.out.print(a[i][j]+"\t");
            }

            System.out.print("\n");
        }
        for(int i=0;i<4;i++){
            countzero=0;
            countone=0;
            for(int j=0;j<4;j++){
                if(a[i][j]==1){
                    countone+=1;
                }
                else{
                   countzero+=1;
                }


            }
            if(countzero==4){
                zerorow_hor_count+=1;
            }
            if(countone==4){
                onerow_hor_count+=1;

            }
        }

            System.out.println("1's horizontal count:"+onerow_hor_count);
        System.out.println("0's horizontal count:"+zerorow_hor_count);


    }
}
