import java.util.*;
class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        int n=arr.length;
        Map<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()>n/3){
                list.add(e.getKey());
            }
        }
        Collections.sort(list);
        return list;
    }
    
}