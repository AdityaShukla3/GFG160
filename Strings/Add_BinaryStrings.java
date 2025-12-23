// User function Template for Java

class Solution {
    public String addBinary(String s1, String s2) {
        // code here
        s1=s1.trim();
        s2=s2.trim();
        int i=s1.length()-1;
        int j=s2.length()-1;
        int sum=0;;
        int cry=0;
        String ans="";
        while(i>=0 || j>=0 || cry==1){
            sum=cry;
            if(i>=0){
                sum+=s1.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum+=s2.charAt(j)-'0';
                j--;
            }
            ans=(sum%2)+ans;
            cry=sum/2;
        }
        while(ans.charAt(0)=='0' && ans.length()>1){
            ans=ans.substring(1);
        }
        return ans;
    }
}