// User function Template for Java

class Solution {
    public int maximumProfit(int arr[]) {
        // Code here
        int n=arr.length;
        int ans=0;
        int buy=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>buy){
                ans=Math.max(ans,arr[i]-buy);
            }
            else buy=arr[i];
        }
        return ans;
    }
}