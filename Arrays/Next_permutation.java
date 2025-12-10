class Solution {
    static void rev(int[] arr,int l,int r){
        while(l<r){
            int t=arr[l];
            arr[l]=arr[r];
            arr[r]=t;
            l++;
            r--;
        }
    }
    void nextPermutation(int[] arr) {
        // code here
        int n=arr.length;
        int pivot=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot==-1){
            rev(arr,0,n-1);
            return;
        }
        for(int i=n-1;i>pivot;i--){
            if(arr[i]>arr[pivot]){
                int t=arr[i];
                arr[i]=arr[pivot];
                arr[pivot]=t;
                break;
            }
        }
        rev(arr,pivot+1,n-1);
    }
}