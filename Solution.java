import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int number = 1994;
        System.out.println("Roman number of "+number+" is "+ sol.intToRoman(number));
    }
    public String intToRoman(int num) {
        HashMap<String, Integer> lookupTable = new HashMap<>();

        String[] romans = {"M","CM","D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int[] values = {1000, 900, 500, 400, 100, 90, 50,  40, 10, 9, 5, 4, 1};

        int i = 0;
        StringBuilder result = new StringBuilder();
        while(num > 0){
            while(num >= values[i]){
                result.append(romans[i]);
                num -= values[i];
            }
            i++;
        }
        return result.toString();
    }
}
