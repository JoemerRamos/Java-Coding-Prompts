import java.util.*;

class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        HashMap<String, Integer> hash = new HashMap<String, Integer>();
        ArrayList<String> uniqueWords = new ArrayList<>();
        String [] words = (A + " " + B).split(" ");
        
        hashAdd(words, hash);

        Arrays.stream(words).forEach(word -> {
           if(hash.get(word) == 1) uniqueWords.add(word); 
        });

        String [] uniqueArray = uniqueWords.toArray(new String[uniqueWords.size()]);
        return uniqueArray;
    }
    
    public void hashAdd(String [] array, HashMap<String, Integer> hash){
        Arrays.stream(array).forEach(word ->{
            hash.put(word, hash.getOrDefault(word, 0) + 1);
        });
    }
}
