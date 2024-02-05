class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
          return false;

        Map<Character,Integer> charS=new HashMap<>();
        Map<Character,Integer> charT=new HashMap<>();

        for(char c:s.toCharArray()){
            charS.put(c,charS.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            charT.put(c,charT.getOrDefault(c,0)+1);
        }
        return charS.equals(charT);
        
    }
}