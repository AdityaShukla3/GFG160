class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1.length!=arr2.length) return false;
        int n=arr1.length;
        for(int i=0;i<n;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}