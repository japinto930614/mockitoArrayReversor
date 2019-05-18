import service.ArrayFlattenerService;

import java.util.Arrays;

public class ArrayReversor {
    private ArrayFlattenerService arrayFlattenerService;

//    public ArrayReversor(){
//
//    }

    public ArrayReversor(ArrayFlattenerService arrayFlattenerService) {
        this.arrayFlattenerService = arrayFlattenerService;
    }

    public  int[] reverseArray (int[][] input){
        if(input == null) return null;

        //service.ArrayFlattenerService = new
        //int[] flattenedArray = service.ArrayFlattenerService
//        int[] flattenedArray = arrayFlattenerService.flattenArray(input);
        int[] flattenedArray = {1,3, 0,4,5,9};

        int[] result = new int[flattenedArray.length];
        int index = 0;
        for(int i = flattenedArray.length - 1 ; i >= 0 ; i--){
            result[index] = flattenedArray[i];
            ++index;
        }


        return result;
    }

//    public static void main(String[] args) {
//        int [][] input = new int [][] {{1,3}, {0},{4,5,9}};
//        int [] output = new ArrayReversor().reverseArray(input);
//        System.out.println(Arrays.toString(output));
//
//    }

    /*public static void main (String[] args){
        int[][] input ={ {1,3}, {0}, {4,5,9}};
        int[] result = reverseArray(input);
        System.out.println(Arrays.toString(result));
    }*/
}
