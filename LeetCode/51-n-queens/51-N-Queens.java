class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][] curr=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(curr[i],'.');
        }
        f(ans, curr, n, 0);
        return ans;
    }
    public void f(List<List<String>> ans, char[][] curr, int n, int row){
        if(n==row){
            List<String> temp=new ArrayList<>();
            for(char[] i:curr){
                temp.add(new String(i));
            }
            ans.add(temp);
            return;
        }
        for(int i=0;i<n;i++){
            if(safe(n, row, i, curr)){
                curr[row][i]='Q';
                f(ans, curr, n, row+1);
                curr[row][i]='.';
            }
        }
    }
    public boolean safe(int n, int row, int col, char[][] curr){
        for(int i=0;i<row;i++){
            if(curr[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(curr[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1, j=col+1; i>=0 && j<n; i--, j++){
            if(curr[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
}