// Last updated: 8/11/2026, 2:15:27 PM
class Solution 
{
    public int f(int n,int k)
    {
        if(n==1)
        {
            return 0;
        }
        return (f(n-1,k)+k)%n;
    }
    public int findTheWinner(int n, int k) 
    {
        return f(n,k)+1;
    }
}