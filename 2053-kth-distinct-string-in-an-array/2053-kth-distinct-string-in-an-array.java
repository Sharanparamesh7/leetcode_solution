class Solution {
    public String kthDistinct(String[] a, int k) 
    {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
       
        for(int i=0; i<a.length; i++){
           map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
       
      
            int i=1;
            for(String s : a){
               if(map.get(s) == 1){
                if(i == k){
                    return s;
                }
                i++;
               } 

            }
        
        return "";
    }
}