package test.coding.test;

public class 피로도 {
    static boolean[] visited;
    static int max = 0;

    public static void main(String[] args) {
        int[][] dungeons = {{80,20},{50,40},{30,10}};
        int k = 80;
        visited = new boolean[dungeons.length];

        dfs(dungeons, k, 0);
        System.out.println("max = " + max);

    }

    public static void dfs(int[][] dungeons, int k, int count) {
        //모든케이스 확인을 위해 반복처리
        for (int i = 0; i < dungeons.length; i++) {
            int 최소피로도 = dungeons[i][0];
            int 소모피로도 = dungeons[i][1];

            //이미 방문을 했거나 최소피로도 충족여부 확인
            if (visited[i] == true || 최소피로도 > k) {
                continue;
            }

            //방문처리
            visited[i] = true;
            dfs(dungeons, k - 소모피로도, count + 1);
            //다른케이스 확인을 위해 방문처리 취소
            visited[i] = false;
        }
        max = Math.max(max, count);
    }



}
