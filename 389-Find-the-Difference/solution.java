public class Solution {
    public char findTheDifference(String s, String t) {
        int[] chars=new int[26];
        char[] ss=s.toCharArray();
        char[] tt=t.toCharArray();
        
        for(char c: ss){
            chars[c-'a']++;
        }
        for(char c: tt){
            chars[c-'a']--;
            if(chars[c-'a']<0)
                return c;
        }
        return ' ';
    }
}