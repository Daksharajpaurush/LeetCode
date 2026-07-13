class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        f(ans, new ArrayList<>(), candidates, target, 0);
        return ans;
    }
    public void f(List<List<Integer>> ans, List<Integer> curr, int[] arr, int t, int idx){
        int n=arr.length;
        if(t==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(t<0 || idx==n){
            return;
        }
        for(int i=idx;i<n;i++){
            if(i>idx && arr[i]==arr[i-1]){
                continue;
            }
            curr.add(arr[i]);
            f(ans,curr,arr,t-arr[i],i+1);
            curr.remove(curr.size()-1);
        }
    }
}