/*
7 6 5 4 3 2 1
7 6 5 4 3 2
7 6 5 4 3 
7 6 5 4
7 6 5
7 6
7
*/
import java.util.Scanner;
class NumberPattern4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows:");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=rows;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}