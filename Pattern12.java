/*
    *
   **
  * *
 *  *
*****
 */
import java.util.Scanner;
class Pattern12{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows:");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int sp=rows;sp>i;sp--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1 || i==j || i==rows){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}