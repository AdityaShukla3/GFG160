class Solution {
    int mem(int[] wt,int[] val,int W,int idx,int[][] dp){
        if(idx==wt.length){
            return 0;
            
        }
        if(dp[idx][W]!=-1){
            return dp[idx][W];
        }
        if(wt[idx]<=W){
            return dp[idx][W]=Math.max(val[idx]+fun(wt,val,W-wt[idx],idx+1,dp),fun(wt,val,W,idx+1,dp));
        }
        else if(wt[idx]>W){
            return dp[idx][W]=fun(wt,val,W,idx+1,dp);
        }
        return 1;
    }
    int top_down(int[] wt,int[] val,int W,int[][] dp){
        int n=wt.length;
        for(int i=0;i<n+1;i++){
            for(int j=0;j<W+1;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                if(wt[i-1]<=j){
                    dp[i][j]=Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
                }
                else if(wt[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int[][] dp=new int[wt.length+1][W+1];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        return mem(wt,val,W,0,dp);
    }
}


