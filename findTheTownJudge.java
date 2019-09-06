class Solution {
    public int findJudge(int N, int[][] trust) {
        int[] count = new int[N+1];
        for (int[] t: trust) {
            count[t[0]]--; //Used so that if a potential judge is seen, then this will be factored in when testing inequality of N-1 
            count[t[1]]++; //Counts each trust dependency 
        }
        
        for (int i = 1; i <= N; ++i) {
            if (count[i] == N - 1 ) return i;
        }
        return -1;
    }
}
