package scratch;

public class Sorter {
    public static int[] bubbleSort(int[] input){
        boolean sorted = false;
        int start = 0;
        while(!sorted && start < input.length -1){
            sorted = true;
            for (int i = start; i < input.length-2; i++){
                if (input[i] > input[i+1]){
                    int temp = input[i];
                    input[i] = input[i+1];
                    input[i+1] = temp;
                    sorted = false;
                }
            }
            start++;
        }
        return input;
    }
}
