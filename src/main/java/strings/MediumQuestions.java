package strings;

import com.sun.source.tree.LiteralTree;

import java.util.*;

public class MediumQuestions {
    public static void main(String[] args) {
        MediumQuestions object = new MediumQuestions();
//        boolean answer = object.isequal("bavgt","tgbav");
//        System.out.println(answer);
        String[] strs = {"a"};
        List<List<String>> name = object.groupAnagrams(strs);
        System.out.println(name);


    }
    public String fractionToDecimal(int numerator, int denominator) {
        float numer = (float)numerator;
        float denom = (float)denominator;
        float remainder  = numerator % denominator;
        String answer = String.valueOf(remainder);
        System.out.println(answer);
        return answer;
    }
//======================================================================================

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> finaloutput = new ArrayList<>();
        MediumQuestions object = new MediumQuestions();
        List<String> keyelements = object.getKeyElements(strs);
        for(String key : keyelements){
            List<String> tobeadded = object.findanagrams(key,strs);
            finaloutput.add(tobeadded);
        }
        return finaloutput;
    }
    private List<String> getKeyElements(String[] strs){
        List<String> keyelements = new ArrayList<>();
        for(int i = 0;i<strs.length;i++){
            String str = strs[i];
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            if(keyelements.contains(sortedString)){
            }else {
                keyelements.add(sortedString);
            }
        }
        return keyelements;
    }
    private List<String> findanagrams(String parent,String[] strs){
        MediumQuestions object2 = new MediumQuestions();
        List<String> tobereturned = new ArrayList<>();
        for(String iterator : strs){
            boolean marker = object2.isequal(parent,iterator);
            if(marker == true){
                tobereturned.add(iterator);
            }
        }
        return tobereturned;
    }
    private boolean isequal(String word1,String word2){
        char[] word1array = word1.toCharArray();
        char[] word2array = word2.toCharArray();
        Arrays.sort(word1array);
        Arrays.sort(word2array);
        if(word1array.length != word2array.length){
            return false;
        }
        for(int i = 0; i<word1array.length;i++){
            if(word1array[i] != word2array[i]){
                return false;
            }
        }
        return true;
    }


//======================================================================================


    public List<String> letterCombinations(String digits) {
        List<String> output = new ArrayList<>();
        Map<Character,String> phonenumbercombinations = new HashMap<>();
        phonenumbercombinations.put('2',"abc");
        phonenumbercombinations.put('3',"def");
        phonenumbercombinations.put('4',"ghi");
        phonenumbercombinations.put('5',"jkl");
        phonenumbercombinations.put('6',"mno");
        phonenumbercombinations.put('7',"pqrs");
        phonenumbercombinations.put('8',"tuv");
        phonenumbercombinations.put('9',"wxyz");
        //check if the ouput list is empoty of not
        //check if the length of input is 0 or not
        if(digits.length() == 0 ){
            return output;
        }
        char[] digitsarray = digits.toCharArray();
        while (digitsarray.length!=0){
            if(digitsarray.length!=0 && output.size() == 0){
                char[] filler = digits.toCharArray();
                for (char ch : filler) {
                    output.add(String.valueOf(ch));
                }
            }
        }
        return output;
    }
}

//======================================================================================

