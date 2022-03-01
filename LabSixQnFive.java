import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class LabSixQnFive {
    public static void swapValues(LinkedList<Integer> list, HashMap<Integer, Integer> hash_map, int indexOne, int indexTwo) {
        System.out.println("list before swap " + list);
        int temp = list.get(indexOne);
        list.set(indexOne, list.get(indexTwo));
        list.set(indexTwo, temp);

        for (int item : list) {
            hash_map.put(list.indexOf(item), item);
        }
        System.out.println("hashmap after swap " + hash_map);
    }

    public static void main(String [] args){
        HashMap<Integer, Integer> hash_map = new HashMap<Integer, Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1,3,5,7,9,11));
        swapValues(list, hash_map, 1, 2);
    }
}
