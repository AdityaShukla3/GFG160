class Solution {
    ArrayList<Integer> search(String pat, String txt) {
        int n=pat.length();
        int m=txt.length();
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<m-n+1;i++){
            
                if(txt.substring(i,i+n).equals(pat)){
                    list.add(i);
                }
            
        }
        return list;
    }
}