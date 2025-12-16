class Solution {
    int maxProduct(int[] arr) {
        // code here
        int n=arr.length;
        int maxP=arr[0];
        int minP=arr[0];
        int ans=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<0){
                int t=maxP;
                maxP=minP;
                minP=t;
            }
            maxP=Math.max(arr[i],arr[i]*maxP);
            minP=Math.min(arr[i],arr[i]*minP);
            ans=Math.max(ans,maxP);
        }
        return ans;
    }
}