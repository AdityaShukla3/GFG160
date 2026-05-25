class overlapping_intervals {
    public static ArrayList<int[]> mergeOverlap(int[][] arr) {
        int n=arr.length;
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        ArrayList<int[]> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int j=i+1;
            while(j<n && arr[i][1]>=arr[j][0]){
                arr[i][1]=Math.max(arr[i][1],arr[j][1]);
                j++;
            }
            
            list.add(arr[i]);
            i=j-1;
        }
        return list;
    }
    public static void main(String[] args) {
        int[][] arr={{1,3},{2,4},{6,8},{9,10}};
        ArrayList<int[]> ans=mergeOverlap(arr);
        for(int[] a:ans){
            System.out.println(a[0] + " "+a[1]);
        }
    }  
}
