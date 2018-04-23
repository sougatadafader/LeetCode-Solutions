/*1032 / 1032 test cases passed.
Status: Accepted
Runtime: 39 ms
Beats other java submission by 94.68%
*/
class ReverseInteger {
    public int reverse(int x) {
        int flag=1;
        if(x<0)
        {
            flag=-1;
            x= x*(-1);
        }
        long n=0;
         while(x>0)
         {
             n= n*10 + x%10;
             x=x/10;
         }
        n=n*flag;
        
        if(n>Integer.MAX_VALUE || n<Integer.MIN_VALUE)
        {
            return 0;
        }
        else
            return (int)n;
    }
}