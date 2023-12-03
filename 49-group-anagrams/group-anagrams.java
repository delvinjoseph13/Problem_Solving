class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       if(strs==null || strs.length==0) return new ArrayList<>();

        Map<String, List<String>> result=new HashMap<>();

        for(String words:strs){
            char[] charArray=words.toCharArray();
            Arrays.sort(charArray);
            String sortedStr=new String(charArray);

            if(!result.containsKey(sortedStr)){
                result.put(sortedStr,new ArrayList<>());
            }
            result.get(sortedStr).add(words);
        }
        return new ArrayList<>(result.values());
    }
}

//  Map<String, List<String>> anagramMap = new HashMap<>();

//         for (String str : strs) {
//             // Sort the characters of the string
//             char[] charArray = str.toCharArray();
//             Arrays.sort(charArray);
//             String sortedStr = new String(charArray);

//             // Check if the sorted string is already in the map
//             if (!anagramMap.containsKey(sortedStr)) {
//                 anagramMap.put(sortedStr, new ArrayList<>());
//             }

//             // Add the original string to the list of anagrams
//             anagramMap.get(sortedStr).add(str);
//         }

//         // Convert values of the map to a list of lists
//         return new ArrayList<>(anagramMap.values());


