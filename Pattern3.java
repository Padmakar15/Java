/*
****
***
**
*
 */
import java.util.Scanner;
class Pattern3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows:");
        int rows=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=rows-i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}