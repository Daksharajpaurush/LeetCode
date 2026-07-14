class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        f(nums, 0, ans);
        return ans;
    }
    public void f(int[] nums, int idx, List<List<Integer>> ans){
        int n=nums.length;
        if(idx==n){
            List<Integer> temp=new ArrayList<>();
            for(int i:nums){
                temp.add(i);
            }
            ans.add(temp);
            return;
        }
        for(int i=idx;i<n;i++){
            swap(nums, idx, i);   //swap
            f(nums, idx+1, ans);  //recurse
            swap(nums, idx, i);   //undo swap to keep nums original
        }
    }
    public void swap(int[] nums, int x, int y){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
}