import java.util.Scanner;
class Pattern2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int sp=n-i-1;sp>0;sp--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}