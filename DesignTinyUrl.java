/*Design TinyUrl problem
739 / 739 test cases passed.
Status: Accepted
Runtime: 21 ms

*/
import java.net.URL;
public class Codec {
    HashMap<Integer,String> map= new HashMap<Integer,String>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        Integer snippet=longUrl.hashCode();
        map.put(snippet,longUrl);
        String generated = "http://tinyurl.com/"+snippet;
        return generated;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String get=null;
        try{
        URL url = new URL(shortUrl);
        Integer file=Integer.parseInt(url.getFile().substring(1));
        
            get= map.get(file);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        return get;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));