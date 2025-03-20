class Solution {
    //Haarrdd
    // find operation
    private int find(int[] dSU, int element) {
        if (dSU[element] == -1) {
            return element;
        }
        return dSU[element] = find(dSU, dSU[element]);
    }

    private void traverseComponent(int[] bitwiseAnd, int current, boolean[] visited, List<List<int[]>> adjcent) {
        visited[current] = true;

        for (int[] edge : adjcent.get(current)) {
            int node = edge[0], weight = edge[1];
            bitwiseAnd[0] &= weight; // calc & and update it

            if (!visited[node]) {
                traverseComponent(bitwiseAnd, node, visited, adjcent);
            }
        }
    }

    public int[] minimumCost(int n, int[][] edges, int[][] query) {
        // 1 - init disjoint set and the adjacent list
        int[] dSU = new int[n];
        Arrays.fill(dSU, -1);

        List<List<int[]>> adjcent = new ArrayList<>(); // like apair
        for (int i = 0; i < n; i++) {
            adjcent.add(new ArrayList<>());
        }

        // fill the adjacent wit node and its weidgts
        for (int[] edge : edges) {
            int from = edge[0], to = edge[1], weight = edge[2];
            adjcent.get(from).add(new int[] { to, weight });
            adjcent.get(to).add(new int[] { from, weight });

            int aRootFrom = find(dSU, from);
            int aRootTo = find(dSU, to);

            if (aRootFrom != aRootTo) {
                dSU[aRootFrom] = aRootTo; // uniionnnn
            }
        }

        // 2 calc min walk cost with bitwiseAnd for each component
        Map<Integer, Integer> parentCost = new HashMap<>();
        boolean[] visited = new boolean[n];
        for(int i = 0; i<n ; i++){
            if(!visited[i]){
                int[] bitwiseAnd = new int[]{adjcent.get(i).isEmpty() ? 0 : adjcent.get(i).get(0)[1]};
                traverseComponent(bitwiseAnd,i,visited, adjcent);
                int parent = find(dSU, i);
                parentCost.put(parent, bitwiseAnd[0]);
            }
        }


        //3 check each query

        int[] answer = new int[query.length];
        for(int i = 0; i<query.length; i++){
             int aRootFrom = find(dSU, query[i][0]);
            int aRootTo = find(dSU,  query[i][1]);

            if (aRootFrom == aRootTo) {
              answer[i] = parentCost.get(aRootFrom);
            }else{
                answer[i] = -1;
            }
        } 
        return answer;
    }
}