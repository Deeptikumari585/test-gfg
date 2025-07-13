//Back-end complete function Template for Java

class Solution {

    void printTriangle(int n) {
        int num=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){ 
                num++;
                System.out.print(num);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}