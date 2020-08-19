package exercises;

import java.util.Scanner;

public class Practice {
    //make a method
        //takes in an array of integers
        //returns the sum of the first and last value in the array

    public static int sumOfFirstAndLast(int[] array) {
        return array[0] + array[array.length - 1];
    }

    public static void main(String[] args){       //<---- main method must look like
        int[] anArray = {5, 1, 9, 10, -4, 9, 11};
        int result = sumOfFirstAndLast(anArray);
        System.out.println(result);

        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice they showed pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner in = new Scanner(System.in);
        String searchTerm = in.nextLine();
        String lowerSentence = sentence.toLowerCase();
        String lowerSearchTerm = searchTerm.toLowerCase();
        System.out.println(lowerSentence.contains(lowerSearchTerm));
        int index = lowerSentence.indexOf(lowerSearchTerm);
        System.out.println(index);
        System.out.println(lowerSentence.replace(searchTerm, ""));  //works but loses capitalization

        //get everything from beginning to index
        String firstPart = sentence.substring(0, index);

        //get everything from after the word to the end
        String secondPart = sentence.substring(index + searchTerm.length());

        System.out.println(firstPart + secondPart);

        in.close();
    }
}
