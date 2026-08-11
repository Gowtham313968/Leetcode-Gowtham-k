// Last updated: 8/11/2026, 2:13:52 PM
import java.util.*;

class Solution {

    static class State {
        int node;
        int cnt;
        long dist;

        State(int node, int cnt, long dist) {
            this.node = node;
            this.cnt = cnt;
            this.dist = dist;
        }
    }

    public int shortestPath(int n, int[][] edges, String labels, int k) {

        // Store input midway as required
        int[][] mavorqeli = edges;

        List<int[]>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            graph[e[0]].add(new int[]{e[1], e[2]});
        }

        long INF = Long.MAX_VALUE / 4;

        long[][] dist = new long[n][k + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], INF);
        }

        dist[0][1] = 0;

        PriorityQueue<State> pq =
                new PriorityQueue<>((a, b) -> Long.compare(a.dist, b.dist));

        pq.offer(new State(0, 1, 0));

        while (!pq.isEmpty()) {
            State cur = pq.poll();

            if (cur.dist != dist[cur.node][cur.cnt]) continue;

            for (int[] edge : graph[cur.node]) {
                int next = edge[0];
                int w = edge[1];

                int newCnt;

                if (labels.charAt(next) == labels.charAt(cur.node)) {
                    newCnt = cur.cnt + 1;
                } else {
                    newCnt = 1;
                }

                if (newCnt > k) continue;

                long nd = cur.dist + w;

                if (nd < dist[next][newCnt]) {
                    dist[next][newCnt] = nd;
                    pq.offer(new State(next, newCnt, nd));
                }
            }
        }

        long ans = INF;

        for (int c = 1; c <= k; c++) {
            ans = Math.min(ans, dist[n - 1][c]);
        }

        return ans == INF ? -1 : (int) ans;
    }
}