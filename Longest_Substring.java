/*3. Longest Substring Without Repeating Characters
   Given "abcabcbb", the answer is "abc", which the length is 3.
   Given "bbbbb", the answer is "b", with the length of 1.
   Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/

class Longest_Substring {
    public int lengthOfLongestSubstring(String s) {
        int string_len=s.length();
        int max =0;
        Set<Character> win=new HashSet<Character>();
        int i=0,j=0;
        while(i<string_len&&j<string_len){
        	if(!win.contains(s.charAt(j))){
        		win.add(s.charAt(j++));
        		if((j-i)>max){
        			max=j-i;
        		}
        	}else{
        		win.remove(s.charAt(i++));
        	}
        }
        return max;
    }
}