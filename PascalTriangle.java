/*
1
11
121
1331
*/
class PascalTriangle{
    static int factorial(int num){
        int fact=1;
        for(int i=num;i>0;i--){
            fact=fact*i;
        }
        return fact;
    }
    static int permutation(int n, int r){
        return factorial(n)/(factorial(r)*factorial(n-r));
    }
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int sp=0;sp<5-i;sp++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(" "+permutation(i,j));
            }
            System.out.println();
        }
    }
}