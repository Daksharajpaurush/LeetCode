class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        f(ans, new ArrayList<>(), 0, s);
        return ans;
    }
    public void f(List<List<String>> ans, List<String> curr, int idx, String s){
        int n=s.length();
        if(idx==n){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=idx;i<n;i++){
            if(palin(s,idx,i)){
                curr.add(s.substring(idx,i+1));
                f(ans, curr, i+1, s);
                curr.remove(curr.size()-1);
            }
        }
    }

    public boolean palin(String s, int left, int right){
        while(left<right){
            if(s.charAt(left++)!=s.charAt(right--)){
                return false;
                }
        }
        return true;
    }
}