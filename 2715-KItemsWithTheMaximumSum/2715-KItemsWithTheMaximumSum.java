// Last updated: 8/11/2026, 2:14:33 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum=0;
        while(k>0){
            if(numOnes>0) {
                sum+=1;
                numOnes--;
            }
            else if(numZeros>0){
                sum+=0;
                numZeros--;
            }
            else{
                sum+=-1;
                numNegOnes--;
            }
            k--;
        }
        return sum;
    }
}