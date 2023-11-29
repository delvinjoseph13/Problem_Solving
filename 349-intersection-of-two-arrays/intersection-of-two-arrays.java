class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       Map<Integer,Integer> hashMap=new HashMap<>();

       Set<Integer> addSet=new HashSet<>();


       for(int num:nums1){
           hashMap.put(num,hashMap.getOrDefault(num,0)+1);
       } 
        List<Integer> resultList=new ArrayList<>();
       for(int num:nums2){
           if(hashMap.containsKey(num) && hashMap.get(num)>0 && !addSet.contains(num)){
               resultList.add(num);
               addSet.add(num);
               hashMap.put(num,hashMap.get(num)-1);
           }
       }
       int resultarray[]=new int[resultList.size()];
       for(int i=0;i<resultList.size();i++){
           resultarray[i]=resultList.get(i);
       }
       return resultarray;
    }
}