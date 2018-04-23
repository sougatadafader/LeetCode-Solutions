/*
76 / 76 test cases passed.
Status: Accepted
Runtime: 8 ms
Beats other java submission by 97.72%
*/
class ValidParentheses {
    public boolean isValid(String s) {
        
        int len=s.length();
		//Stack<Character> st= new Stack<> ();
        if (len==1)
            return false;
		int i=0;
        float val=200;
		while(i<len)
		{
            
			if(s.charAt(i)=='(')
                val= (val-10)*5;
            else if(s.charAt(i)==')')
                val= (val/5)+10;
            else if(s.charAt(i)=='{')
                val= (val*5)+1;
            else if(s.charAt(i)=='}')
                val= (val-1)/5;
            else if(s.charAt(i)==']')
                val= (val*5)+3;
            else if(s.charAt(i)=='[')
                val= (val-3)/5;
            i++;
                
		}
		
		return (val==200);
        
    }
}