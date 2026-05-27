package GFG160.Matrix;
class Solution {
    public void rotateMatrix(int[][] arr) {
        // code here
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int t=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=t;
            }
        }
        int l=0;
        int h=n-1;
        while(l<h){
            for(int j=0;j<m;j++){
                int t=arr[l][j];
                arr[l][j]=arr[h][j];
                arr[h][j]=t;
            }
            l++;
            h--;
        }
        
    }
}