/*
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
*/
import java.util.Scanner;
class NumberPattern7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows:");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=i;j>0;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}