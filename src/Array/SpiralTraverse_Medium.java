package Array;

import java.util.*;
public class SpiralTraverse_Medium {
    public static List<Integer> spiralTraverse(int[][] arr) {
        // Write your code here.
        ArrayList<Integer> res = new ArrayList<>();
        int sR = 0;
        int sC = 0;
        int eC = arr[0].length-1;
        int eR = arr.length-1;
        int totalSize = eC*eR;
        while(sR<=eR && sC <= eC ){

            for(int i=sC; i <= eC; i++ ){
                res.add(arr[sR][i]);
            }

            for(int i=sR+1; i <= eR; i++){
                res.add(arr[i][eC]);
            }

            for(int i=eC-1; i >= sC; i--){
                if(sR != eR) res.add(arr[eR][i]);
            }

            for(int i=eR-1; i > sR; i--){
                if(sC !=eC) res.add(arr[i][sC]);
            }

            sC++;
            sR++;
            eC--;
            eR--;

        }



        return res;
    }
}
