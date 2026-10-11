class Solution {
    public int twoCitySchedCost(int[][] costs) {
        ArrayList<ArrayList<Integer>> costDiff = new ArrayList<>();
        for(int i = 0; i< costs.length; i++){
            ArrayList<Integer> diff = new ArrayList<>();
            diff.add(costs[i][0] - costs[i][1]);
            diff.add(costs[i][0]);
            diff.add(costs[i][1]);
            costDiff.add(diff);
        }
        costDiff.sort(Comparator.comparing(innerList -> innerList.get(0)));

        int minCost = 0;
        for(int i = 0; i<costDiff.size()/2; i++){
            minCost += costDiff.get(i).get(1);
        }
        for(int i = costDiff.size()/2; i<costDiff.size(); i++){
            minCost += costDiff.get(i).get(2);
        }
        return minCost;
    }
}