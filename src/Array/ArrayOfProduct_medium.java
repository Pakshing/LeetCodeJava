package Array;

public class ArrayOfProduct_medium {
    public int[] arrayOfProducts(int[] arr) {
        // Write your code here.
        //O(n) Time || O(n) Space
        int[] res = new int[arr.length];
        int leftProducts = 1;
        int rightProducts = 1;

        for(int i=0; i < arr.length; i++){
            res[i] = leftProducts;
            leftProducts *= arr[i];
        }

        for(int i=arr.length-1; i >=0; i--){
            res[i] *= rightProducts;
            rightProducts *= arr[i];
        }

        return res;
    }
}

