//Made by Daniel Sabanov
package piglatinconverter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PigLatinConverter {
//"C:\\Users\\danie\\Desktop\\test.txt"
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sentence;
        String path;
        String word;
        File file;
        
        System.out.println("Enter path to file");
        path = new Scanner(System.in).next();
        file = new File(path);
        sentence = new Scanner(file);

        while (sentence.hasNext()) {
            word = sentence.next();
            System.out.println(word + "\t" + convertToPigLatin(word));
        }

    }

    public static String convertToPigLatin(String word) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String remainder;
        
        for (int i = 0; i < vowels.length; i++) {
            if (word.toLowerCase().charAt(0) == vowels[i]) {
                word = word + "WAY";
                return word.toUpperCase();
            }
        }
        for(int i = 0; i < word.length(); i++){
            for(int j = 0; j < vowels.length; j++){
                if(word.toLowerCase().charAt(i) == vowels[j]){
                    remainder = word.substring(0, i);
                    word = word.substring(i);
                    word = word + remainder + "AY";
                    return word.toUpperCase();
                }
            }
        }
        return word;
    }
}
