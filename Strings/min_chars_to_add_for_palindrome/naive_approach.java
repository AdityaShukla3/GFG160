class Solution {
    boolean pal(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public int minChar(String s) {
        // code here
        // int n=s.length();
        int i=s.length()-1;
        int c=0;
        while(i>=0 && !pal(s,0,i)){
            c++;
            i--;
        }
        return c;
    }
}