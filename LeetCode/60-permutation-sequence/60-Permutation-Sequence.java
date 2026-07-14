class Solution {
    public String getPermutation(int n, int k) {
        int fact=1;
        List<Integer> num=new ArrayList<>();
        for(int i=1;i<n;i++){
            fact=fact*i;
            num.add(i);
        }
        String ans="";
        num.add(n);
        k=k-1;
        while(true){
            int idx=k/fact;
            ans+=num.get(idx);
            num.remove(idx);

            if(num.size()==0){
                break;
            }

            k=k%fact;
            fact=fact/num.size();
        }
        return ans;
    }
}