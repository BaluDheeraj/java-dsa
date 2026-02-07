class Solution {
    public int minimumDeletions(String s) {
        int count=0;
        int del=0;
        for(char c : s.toCharArray()){
            if(c=='b'){
                count++;
            }
            else{
                del=Math.min(del+1,count);
            }
        }
        return del;
    }
}


// with stack implementation
class Solution {
    public int minimumDeletions(String s) {
       Stack<Character> stack = new Stack<>();
       int count=0;
       for(int i=0;i<s.length();i++){
          
             if( !stack.isEmpty()&&stack.peek()=='b'&& s.charAt(i)=='a'){
                stack.pop();
                count++;
            }
            else{
            stack.push(s.charAt(i));
            }
       }
        return count;

    }
}
