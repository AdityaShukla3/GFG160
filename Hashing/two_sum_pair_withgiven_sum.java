class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        int n=arr.length;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            int find=target-arr[i];
            if(set.contains(find)){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}