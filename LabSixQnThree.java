import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Random;

// lab 6

public class LabSixQnThree {
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

    public static int findValue(LinkedList<Integer> list, int searchVal) {
        if (list.contains(searchVal)) {
            return list.indexOf(searchVal);
        } else {
            return -1;
        }
    }

    public static void main(String [] args){
        LinkedList<Integer> listRandom = listOfRandInt();
        findValue(listRandom, randomValue());
        System.out.println(findValue(listRandom, randomValue()));
    }
}

