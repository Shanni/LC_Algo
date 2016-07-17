public class Solution {
    
    List<String> result=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        String init="";
        backtrack(init, n, n);
        return result;
    }
    
    public void backtrack(String str, int open, int close){
        if(open==0 && close==0){
            result.add(str);
            return;
        }
        
        if(open>0)
            backtrack(str+"(", open-1, close);
        if(close>open)
            backtrack(str+")", open, close-1);
    }
}