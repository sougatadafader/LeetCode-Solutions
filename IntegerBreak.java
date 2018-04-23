/*50 / 50 test cases passed.
Status: Accepted
Runtime: 0 ms
Beats other java submission by 100%
*/
class IntegerBreak {
    public int integerBreak(int n) {
        int error= 2066242608;
        if(n>58)
        {
            return error;
        }
        else if(n==3 || n==2)
            return n-1;
        else 
        {
            
            if(n%3 ==2){
                
                return (int)Math.pow(3,n/3)*2;
            }
            else if(n%3 ==1)
            {
                int ctr=0;
                
                return (int)Math.pow(3,(n-4)/3)*4;
            }
            else 
            {
                int ctr=0;
                
                return (int) Math.pow(3,n/3);
                
                
            }
        }   
        
    }
}