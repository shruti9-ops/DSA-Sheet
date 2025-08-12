// By using bit manipulation
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 && (n&(n-1)) ==0;
            }
}
// solution by using loops(Brute forece approach)
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        while(n%2 == 0){
            n/=2;
        }
        return n==1;
       
            }
}
