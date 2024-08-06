class Solution {
    public int countPoints(String rings) {
        HashMap<Integer,HashSet<Character>> map = new HashMap<>();
        for(int i = 0; i < rings.length(); i += 2){
            char color = rings.charAt(i);
            int rod = rings.charAt(i+1);
            map.put(rod, map.getOrDefault(rod, new HashSet()));
            map.get(rod).add(color);
        }
        
        int count = 0;
        for(Map.Entry<Integer,HashSet<Character>> e : map.entrySet()){
            if(e.getValue().size() == 3){
                count ++;
            }
        }
        return count;
    }
}