class Solution {
    static void swap(int a,int b,int[] arr){
        int t=arr[a];
        arr[a]=arr[b];
        arr[b]=t;
    }
    public void sort012(int[] arr) {
        // code here
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(low,mid,arr);
                low++;
                mid++;
            }
            else if(arr[mid]==1) mid++;
            else if(arr[mid]==2){
                swap(mid,high,arr);
                high--;
            }
        }
        
    }
}