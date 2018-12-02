// Made by Daniel Sabanov
package isprimepalindromic;

import java.util.*;

public class IsPrimePalindromic {

    private static ArrayList<Integer> array = new ArrayList<Integer>();

    public static void main(String[] args) {
        
        for (int i = 1; i <= 100000; i++) {
            
            boolean palindrome = isPalindromic(i);
            boolean prime = isPrime(i);

            if (palindrome && prime) {

                System.out.println(i);

            }

        }
    }

    private static boolean isPrime(int i) {
        if(i == 1) return false;
        for(int j = 0; j < array.size(); j++){
            if(i % (array.get(j)) == 0){
                return false;
            }
        }
        array.add(i);
        return true;
    }

    private static boolean isPalindromic(int i) {
        int comparedValue = i;
        int palindrome = 0;
        
        while(i > 0){
            palindrome = palindrome * 10 + i % 10;
            i = i/10;
        }
        return (comparedValue == palindrome);
    }

}
