package Array;

import java.util.*;
public class TournamentWinner {
    public String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        // Write your code here.
        // T:O(n) where n is the number of competitions
        // S:O(k) where k is the number of teams
        Map<String, Integer> scores = new HashMap<>();
        String curWinner ="";
        int curMax = -1;

        for(int i=0; i < competitions.size(); i++){
            String winner = competitions.get(i).get(  (1-results.get(i)) ) ;
            if(scores.containsKey(winner)){
                int newScore = scores.get(winner)+3;
                curMax = Math.max(newScore, curMax);
                if(curMax == newScore) curWinner = winner;

                scores.put(winner, newScore);
            }else{
                if(curMax <0) curWinner = winner;
                curMax = Math.max(3, curMax);
                scores.put(winner,3);
            }

        }
        return curWinner;
    }
}
