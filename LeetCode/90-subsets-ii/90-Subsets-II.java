class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        f(res, new ArrayList<>(), nums, 0);
        return res;
    }
    public void f(List<List<Integer>> res, List<Integer> curr, int[] nums, int idx){
        res.add(new ArrayList<>(curr));
        for(int i=idx;i<nums.length;i++){

            if(i>idx && nums[i]==nums[i-1]){
                continue;
            }

            curr.add(nums[i]);
            f(res, curr, nums, i+1);
            curr.remove(curr.size()-1);
        }
    }
}