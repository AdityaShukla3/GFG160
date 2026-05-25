class Solution {
    public boolean areRotations(String s1, String s2) {
        // code here
        String s=s2+s2;
        int n=s.length();
        int m=s1.length();
        boolean ans=false;
        for(int i=0;i<n-m;i++){
            if(s.substring(i,i+m).equals(s1)){
                ans=true;
                break;
            }
        }
        return ans;
    }
}