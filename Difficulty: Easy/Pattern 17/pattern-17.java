class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=1; i<=n; i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");

            }
            //character
            for(int j=1;j<=i;j++){
                System.out.print((char)(j+64));
            }
            for(int j=i-1;j>=1;j--){
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    


    }
}