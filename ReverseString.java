class ReverseString {
    public String reverseString(String s) {
        
		if(s.length()<=1)
            return s;
        else
        {
            char[] newarray = s.toCharArray();
            int left;
	    	int right=s.length()-1;
		    char temp;
		    for(left=0;left<right;left++,right--)
		    {
			    temp=newarray[left];
			    newarray[left]= newarray[right];
			    newarray[right]=temp;
		    }
		    s= String.valueOf(newarray);
	    	return s;
        }
    }
}