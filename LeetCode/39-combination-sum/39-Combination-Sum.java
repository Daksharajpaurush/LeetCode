class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        f(ans, new ArrayList<>(), target, 0, candidates);
        return ans;
    }
    public void f(List<List<Integer>> ans, List<Integer> curr, int t, int idx, int[] arr){
        int n=arr.length;
        if(t==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(t<0 || idx==n){
            return;
        }
        for(int i=idx;i<n;i++){
            curr.add(arr[i]);
            f(ans,curr,t-arr[i],i,arr);
            curr.remove(curr.size()-1);
        }
    }
}