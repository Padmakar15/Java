/*
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
*/
import java.util.Scanner;
class NumberPattern10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows:");
        int rows=sc.nextInt();
        int nextNo=0;
        System.out.println("1");
        for(int i=2;i<=rows;i++){
            System.out.print(i+" ");
            nextNo=i;
            for(int j=1;j<i;j++){
                nextNo+=(rows-j);
                System.out.print(nextNo+" ");
            }
            System.out.println();
        }
    }
}