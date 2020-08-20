package exercises;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListAdder {

    public static ArrayList<Integer> sumArrayLiat(ArrayList<Integer> first, ArrayList<Integer> second) {

        //check the length of the arraylists, figure out which is longer
        if(first.size() > second.size()) {
            //for each element in the longer arraylist
            return sumLonger(first, second);
        }else {
            return sumLonger(second, first);
        }
    }

    public static  ArrayList<Integer> sumLonger(ArrayList<Integer> longer, ArrayList<Integer> shorter) {
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < longer.size(); i++) {

            //if i haven't run out of ints from the shorter list
            if(i < shorter.size()) {
                Integer sum = longer.get(i) + shorter.get(i);
                result.add(sum);
            }else {
                //just keep the value from the longer list
                result.add(longer.get(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> first = new ArrayList<>();
        first.add(3);
        first.add(4);
        first.add(5);
        first.add(1);

        ArrayList<Integer> second = new ArrayList<>();
        first.add(1);
        first.add(6);

        ArrayList<Integer> result = sumArrayLiat(second, first);
        System.out.println(result);
    }
}
