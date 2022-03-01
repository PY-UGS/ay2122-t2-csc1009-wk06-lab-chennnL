import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class LabSixQnFour {
    public static void addAndSort(LinkedList<Integer> list, HashMap<Integer, Integer> hash_map, int value) {
        boolean insert = false;

        System.out.println("hash map before add " + hash_map);

        for (int temp : list) {
            if (temp >= value){
                list.add(list.indexOf(temp),value);
                insert = true;
            }
            if (insert == true){
                break;
            }
        }
        if (!insert){
            list.add(value);
        }

        for (int temp : list) {
            hash_map.put(list.indexOf(temp), temp);
        }

        System.out.println("hash map after add " + hash_map);
    }

    public static void main(String[] args) {
        HashMap<Integer, Integer> hash_map = new HashMap<Integer, Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1, 3, 5, 7, 9, 11));
        addAndSort(list, hash_map, 4);
    }
}
