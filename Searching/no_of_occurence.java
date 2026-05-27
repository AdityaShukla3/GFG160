class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int[] map=new int[1000001];
        for(int i:arr){
            map[i]++;
        }
        return map[target];
    }
}
