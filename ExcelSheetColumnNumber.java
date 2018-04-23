/*1000 / 1000 test cases passed.
Status: Accepted
Runtime: 5 ms*/

class ExcelSheetColumnNumber {
    public int titleToNumber(String s) { 
        char c[];
		c=s.toCharArray();
		int result=0;
		int ctr=0;
		for(int i=0;i<c.length;i++)
		{
			int n= c[i]-64;
			if(result>0)
			{
				result= (26*result)+n;
			}
			else
				result+=n;
		}
        return result;
        
    }
}