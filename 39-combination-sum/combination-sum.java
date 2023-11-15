class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(candidates,target,0,new ArrayList<>(),result);
        return result;
    }

    private static void backTrack(int[] candidates,int target,int start,List<Integer>path,List<List<Integer>> result){
        if(target==0){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i=start;i<candidates.length;i++){
            if(candidates[i]>target){
                continue;
            }
            path.add(candidates[i]);
            backTrack(candidates,target-candidates[i],i,path,result);
            path.remove(path.size()-1);
        }
    }
}