class Solution {
    public int maxDepth(String s) {
        int o=0;
        int c=0;
        int max=0;

        for(int i =0;i<s.length();i++){
            
            if(s.charAt(i)=='('){
                    o++;
            }
              if(s.charAt(i)==')'){
                    c++;
            }
            max=Math.max(max,o-c);
        }
        return max;
        
    }
}
