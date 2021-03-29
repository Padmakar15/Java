/*
1
1 0
1 0 1
1 0 1 0
1 0 1 0 1
*/
import java.util.Scanner;
class NumberPattern8{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows:");
        int rows=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                if(j%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}