class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();

        makeCombination(nums,target,0,new ArrayList<>(),0,res);
        return res;
    }
    private void makeCombination(int[] nums,int target,int idx,List<Integer> comb,int total,
    List<List<Integer>> res){
        if(total == target){
            res.add(new ArrayList<>(comb));
            return;
        }
        if(total>target || idx >= nums.length){
            return;
        }

        comb.add(nums[idx]);
        makeCombination(nums,target,idx,comb,total + nums[idx],res);
        comb.remove(comb.size() - 1);
        makeCombination(nums,target,idx+1,comb,total,res);
    }
}
