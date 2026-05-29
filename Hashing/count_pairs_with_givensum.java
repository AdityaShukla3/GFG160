class Solution {
    int countPairs(int arr[], int t) {
        // code here
        int n=arr.length;
        Map<Integer,Integer> map=new HashMap<>();
        int c=0;
        
        for(int i=0;i<n;i++){
            if(map.containsKey(t-arr[i])){
                c+=map.get(t-arr[i]);
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        return c;
    }
}