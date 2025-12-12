// User function Template for Java
class Solution {
    public int maximumProfit(int arr[]) {
        // code here
        int n=arr.length;
        int profit=0;
        int buy=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                profit+=arr[i-1]-buy;
                buy=arr[i];
            }
        }
        profit+=arr[n-1]-buy;
        return profit;
    }
}