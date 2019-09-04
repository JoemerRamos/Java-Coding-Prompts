class Solution {
    public int[] diStringMatch(String S) {
        int increase = 0, decrease = S.length();
        int [] array = new int [S.length() + 1];
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == 'I') array[i] = increase++;
            else{
                array[i] = decrease--;
            }
        }
        
        if(S.charAt(S.length() - 1) == 'I') array[S.length()] = increase;
        else{
            array[S.length()] = decrease;
        }
        return array;
    }
}
