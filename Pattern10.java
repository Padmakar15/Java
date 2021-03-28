/*
* * * * *
 * * * *
  * * *
   * *
    *
   * *
  * * *
 * * * *
* * * * *
 */

 import java.util.Scanner;
 class Pattern10{
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter no of rows:");
         int rows=sc.nextInt();
         for(int i=0;i<rows;i++){
            for(int sp=i;sp>0;sp--){
                System.out.print(" ");
            }            
            for(int j=rows-i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
         }
         for(int i=1;i<rows;i++){
            for(int sp=rows-i-1;sp>0;sp--){
                System.out.print(" ");
            }            
            for(int j=i;j>=0;j--){
                System.out.print("* ");
            }
            System.out.println();
         }
     }
 }