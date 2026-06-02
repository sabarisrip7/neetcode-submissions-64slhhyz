class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        makeCombination(candidates,target,0,new ArrayList<>(),0,res);
        return res;
    }
    private void makeCombination(int[] candidates,int target,int idx,List<Integer> comb,
    int total,List<List<Integer>> res){
        if(total == target){
            res.add(new ArrayList<>(comb));
            return;
        }
        if(total>target || idx>=candidates.length){
            return;
        }
        comb.add(candidates[idx]);
        makeCombination(candidates,target,idx+1,comb,total+candidates[idx],res);
        comb.remove(comb.size()-1);

        int next = idx+1;
        for(;next < candidates.length && candidates[next] == candidates[idx];next++);
        makeCombination(candidates,target,next,comb,total,res);
    }
}
