import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

// lab 6

public class LabSixQnTwo {

    public static void swapValues(LinkedList<Integer> list, int indexOne, int indexTwo) {
        System.out.println("List before swap " + list);
        int temp = list.get(indexOne);
        list.set(indexOne, list.get(indexTwo));
        list.set(indexTwo, temp);
        System.out.println("List after swap " + list);
    }

    public static void main(String [] args){
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1,3,5,7,9,11));
        swapValues(list, 1, 5);
    }
}

