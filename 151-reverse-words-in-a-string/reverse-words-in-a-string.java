class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" +");
        // StringBuilder sb=new StringBuilder();
        String reverse="";

        for(int i=words.length-1;i>=0;i--){
            // sb.append(words[i]);
            // sb.append(" ");
            reverse+=words[i];
            reverse+=" ";
        }
        return reverse.toString().trim();
    }
}