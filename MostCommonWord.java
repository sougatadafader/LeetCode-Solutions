/*46 / 46 test cases passed.
Status: Accepted
Runtime: 30 ms
*/
class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
       
		paragraph= paragraph.replaceAll("\\p{Punct}","").toLowerCase();
		for (int i=0;i<banned.length;i++)
		{
			banned[i]=banned[i].toLowerCase();
		}
		
		HashMap<String, Integer> count= new HashMap<>();
		String[] words= paragraph.split(" ");
		for(int i=0;i<words.length;i++)
		{
			
			if(!count.containsKey(words[i]))
				count.put(words[i], 1 );
			else
				count.put(words[i], count.get(words[i]) + 1 );
		}
		for(int i=0;i<banned.length;i++)
		{
			if(count.containsKey(banned[i]))
				count.remove(banned[i]);
		}
		int max= 0;
		String var=null;
		for(String key: count.keySet())
		{
			
			int val=count.get(key);
			if(val>max)
			{
				
				max=val;
				var=key;
			}
		}
        return var;
    }
}