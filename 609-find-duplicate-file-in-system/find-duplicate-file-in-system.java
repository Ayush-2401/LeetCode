class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i<paths.length; i++){
            String[] parts = paths[i].split(" ");
            for(int j = 1; j<parts.length; j++){
                int open = parts[j].indexOf("(");
                int close = parts[j].indexOf(")");
                String content = parts[j].substring(open+1,close);
                String path = parts[0]+"/"+parts[j].substring(0,open);

                if(map.get(content) == null){
                    map.put(content, new ArrayList<>());
                }
                map.get(content).add(path);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(List<String> p : map.values()){
            if(p.size()>1){
                ans.add(p);
            }
        }
        return ans;

    }
}