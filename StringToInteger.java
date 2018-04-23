/*
1053 / 1053 test cases passed.
Status: Accepted
Runtime: 48 ms
Beats other java submission by 61.87%
*/


class Solution {
    public int myAtoi(String str) {
        int i=0;
        int sum=0;
        int ctr=0;
        int sign=1;
        int flag=0;
        int len= str.length();
        double temp=0;
        int space=0;
        for(int j=0;j<str.length();j++)
        {
            i= str.charAt(j);
            if(i>=48 && i<=57)
            {
                ctr++;
                i=i-48;
                temp= (double) sum +((double)i/10);
                if(sign>0 && sum+i>=214748371)
                {
                    sum=2147483647;
                    return sum*sign;
                }
                
                else if (sign<0 && ((temp + i/10 ) >214748364.8))
                {
                    
                    sum= -2147483648;
                    return sum;
                }
                sum= (sum * 10) + i;
                
            }
            
            else if(i==45 || i==43)
            {
                sign*= 44-i;
                flag+=1;
                ctr++;
            }
            else if(i==32)
            {
                if(ctr>0)
                    return sum*sign;
                space++;
            }
            else
                return sum*sign;
            
            if(flag>1)
                return 0;
            
        }
        
        return sum*sign;
    }
}