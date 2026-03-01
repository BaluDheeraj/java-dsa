class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer> mapab= new HashMap<>();
        HashMap<Character,Integer> mapba= new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!mapab.containsKey(s.charAt(i))){
                mapab.put(s.charAt(i),i);
            }
             if(!mapba.containsKey(t.charAt(i))){
                mapba.put(t.charAt(i),i);
            }
            if(!mapab.get(s.charAt(i)).equals(mapba.get(t.charAt(i)))){
                return false;
            }
            
        }
        return true;
    }
}
