class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                for(int j=i+1;j<n;j++){
                    if(arr[j]!=0){
                        int t=arr[i];
                        arr[i]=arr[j];
                        arr[j]=t;
                        break;
                    }
                }
            }
        }

    }
}