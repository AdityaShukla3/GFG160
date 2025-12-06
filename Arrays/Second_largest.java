class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=Integer.MIN_VALUE;
        int smax=max;
        
        int n=arr.length;
        if(n==1) return -1;  
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
                
            }
            else if(arr[i]<max && arr[i]>smax){
                smax=arr[i];
            }
        }
        if(smax==Integer.MIN_VALUE) return -1;
        return smax;
    }
}