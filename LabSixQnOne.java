import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

// lab 6

public class LabSixQnOne {

    public static void addAndSort(LinkedList<Integer> list, int value){
        boolean insert = false;

        System.out.println("list before add " + list);

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

        System.out.println("list after add " + list);
    }


    public static void main(String [] args){
        LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1,3,5,7,9,11));
        addAndSort(list, 4);
    }
}

