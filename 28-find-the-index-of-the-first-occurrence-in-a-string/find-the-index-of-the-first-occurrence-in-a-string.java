class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) return 0;

        int haylen=haystack.length();
        int needlen=needle.length();

        for(int i=0;i<=haylen-needlen;i++){
            if(haystack.substring(i,i+needlen).equals(needle))
            return i;

        }
        return -1;
    }
}

