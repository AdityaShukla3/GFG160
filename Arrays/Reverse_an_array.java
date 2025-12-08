class Solution {
    static void reverseArray(int arr[]) {
        // code here
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int t=arr[l];
            arr[l]=arr[r];
            arr[r]=t;
            l++;
            r--;
        }
    }
    
}