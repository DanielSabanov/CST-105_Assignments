//Made by Daniel Sabanov
package arrayreader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArrayReader {

    public static void main(String[] args) throws FileNotFoundException {

        String sentence;
        char[][] array;

        sentence = translateFileToString(getFilePath());
        array = fillTheArray(sentence);
        System.out.println(makeNewString(array));

    }

    public static char[][] fillTheArray(String sentence) {
        // Fills the array with chars from a string.
        
        final int ARRAY_ROW_LENGTH = 20;
        final int ARRAY_COLUMN_LENGTH = 45;

        char[][] array = new char[ARRAY_ROW_LENGTH][ARRAY_COLUMN_LENGTH];
        int currentLetter = 0;

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                if (sentence.length() > currentLetter) {
                    array[row][column] = sentence.charAt(currentLetter);
                } else {
                    array[row][column] = '@';
                }
                currentLetter++;
            }
        }
        return array;
    }

    public static Scanner getFilePath() throws FileNotFoundException {
        // Prompets the user to input a path towards the desired file.
        
        String path;
        File file;

        System.out.println("Enter path to file");
        path = new Scanner(System.in).next();
        file = new File(path);

        return new Scanner(file);
    }

    public static String translateFileToString(Scanner sc) {
        //Takes a scanner instance and translates it into a string.
        
        String string = "";
        
        while (sc.hasNext()) {
            string = string + sc.next() + " ";
        }
        return string;
    }

    public static String makeNewString(char[][] arr) {
        //Compiles a string out of the elements of the given array.
        
        int column;
        int row = 0;
        String newSentence = "";

        for (column = 0; column < arr[row].length; column++) {
            for (int i = 0; arr.length > i; i++) {
                newSentence = newSentence + arr[i][column];
            }
        }
        return newSentence;
    }
}
