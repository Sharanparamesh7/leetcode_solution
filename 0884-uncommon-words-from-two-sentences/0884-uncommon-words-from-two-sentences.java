class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String str1[] = s1.split(" ");
        String str2[] = s2.split(" ");

        HashMap<String,Integer> map = new HashMap<>();

        for(String s : str1){
            map.put(s,map.getOrDefault(s,0) + 1);
        }

        for(String s : str2){
            map.put(s,map.getOrDefault(s,0) + 1);
        }

        int count = 0;
        for(Map.Entry<String,Integer> e : map.entrySet()){
            if(e.getValue() == 1){
                count ++;
            }
        }

        String arr[] = new String[count];
        int i = 0;
        for(Map.Entry<String,Integer> e : map.entrySet()){
            if(e.getValue() == 1){
                arr[i++] = e.getKey(); 
            }
        }
        return arr;
    }
}