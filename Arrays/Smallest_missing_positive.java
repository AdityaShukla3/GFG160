class Solution {
    public int missingNumber(int[] arr) {
        // code here
        int n=arr.length;
        Set<Integer> set=new HashSet<>();
        for(int i:arr) set.add(i);
        for(int i=1;i<=n+1;i++){
            if(!set.contains(i)) return i;
        }
        return 1;
    }
}
