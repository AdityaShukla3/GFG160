class Solution {
    public int findMin(int[] arr) {
        // code here
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        for(int i:arr){
            min=Math.min(min,i);
        }
        return min;
    }
    public int bs(int[] arr){
        int low=0;
        int high=arr.length-1;
        int min=Integer.MAX_VALUE;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[low]<=arr[mid]){
                min=Math.min(min,arr[low]);
                high=mid-1;
            }
            else if(arr[high]>mid){
                min=Math.min(min,arr[mid]);
                low=mid+1;
            }
        }
        return min;
    }
}
