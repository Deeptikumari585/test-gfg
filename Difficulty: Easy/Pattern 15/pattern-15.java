class Solution {

    void printTriangle(int n) {
        // code here
        
        
        for(int i=n;i>=1;i--){
            
            for(char ch='A';ch<'A' + i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}