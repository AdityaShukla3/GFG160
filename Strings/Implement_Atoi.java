class Solution {
    public int myAtoi(String s) {
        // code here
        s=s.trim();
        long ans=0;
        int sign=1;
        int n=s.length();
        if(n==0) return 0;
        int i=0;
        if(s.charAt(0)=='-'){
            sign=-1;
            i++;
        }
        if(s.charAt(0)=='+') i++;
        while(i<n){
            if(s.charAt(i)<'0' || s.charAt(i)>'9') break;
            ans=ans*10+(s.charAt(i)-'0');
            if(sign*ans>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign*ans<Integer.MIN_VALUE) return Integer.MIN_VALUE; 
            i++;
        }
        return (int)(sign*ans);
    }
}