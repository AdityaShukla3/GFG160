class Solution {
    static int kadane(int[] arr){
        int n=arr.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            max=Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
            
        }
        return max;
    }
    public int maxCircularSum(int arr[]) {
        // code here
        int n=arr.length;
        int ans1=kadane(arr);
        int total=0;
        for(int i=0;i<n;i++){
            total+=arr[i];
            arr[i]=-arr[i];
            
        }
        int sum2=kadane(arr);
        int ans2=total+sum2;
        if(ans2==0) return ans1;
        return Math.max(ans1,ans2);
    }
}
