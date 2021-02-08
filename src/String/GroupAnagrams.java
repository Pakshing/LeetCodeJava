package String;

import java.util.*;
public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(List<String> words) {
        // Write your code here.
        //O( w* nlogn ) time || O (wn) space
        //w is the number of words and n is the length of the longest word
        Map< String, List<String> > anagrams = new HashMap<>();

        for(String word:words){
            char[] wordArray = word.toCharArray();
            Arrays.sort(wordArray);
            String sortedWord = new String(wordArray);

            if(anagrams.containsKey(sortedWord)){
                anagrams.get(sortedWord).add(word);
            }else{
                ArrayList<String> newList = new ArrayList<>();
                newList.add(word);
                anagrams.put(sortedWord,newList);
            }
        }

        return new ArrayList(anagrams.values());
    }
}
