class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        char ans='$';
        int[] map=new int[26];
        for(char c:s.toCharArray()){
            map[c-'a']++;
        }
        for(char c:s.toCharArray()){
            if(map[c-'a']==1){
                ans=c;
                break;
            }
        }
        return ans;
    }
}
