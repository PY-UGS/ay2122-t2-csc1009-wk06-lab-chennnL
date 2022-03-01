import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

public class LabSixQnSix {
    public static LinkedList listOfRandInt() {
        LinkedList<Integer> listRandom = new LinkedList<Integer>();
        for (int i = 0; i < 500; i++) {
            Random random = new Random();
            int num = random.ints(1000,10000).findFirst().getAsInt();
            listRandom.add(num);
        }
        System.out.println(listRandom);
        return listRandom;
    }

    public static int randomValue(){
        Random random = new Random();
        int searchVal = random.ints(1000,10000).findFirst().getAsInt();
        return searchVal;
    }

    public static int findValue(HashMap<Integer, Integer> hash_map, int searchVal) {
        if (hash_map.containsValue(searchVal)) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String [] args){
        HashMap<Integer, Integer> hash_map = new HashMap<Integer, Integer>();
        LinkedList<Integer> listRandom = listOfRandInt();
        for (int item : listRandom) {
            hash_map.put(listRandom.indexOf(item), item);
        }
        findValue(hash_map, randomValue());
    }
}
