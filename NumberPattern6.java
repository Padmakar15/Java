/*
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
*/
import java.util.Scanner;
class NumberPattern6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows:");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            if(i>1){
                for(int k=(i-1);k>0;k--){
                    System.out.print(k+" ");
                }
            }
            System.out.println();
        }
    }
}