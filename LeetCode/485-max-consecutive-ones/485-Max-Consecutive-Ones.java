class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt=0, ans=0;
        for(int i:nums){
            if(i==1){
                cnt++;
                ans=Math.max(ans,cnt);
            }else{
                cnt=0;
            }
        }
        return ans;
    }
}