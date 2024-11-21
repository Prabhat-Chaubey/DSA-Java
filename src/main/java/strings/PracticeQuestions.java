package strings;

import java.lang.reflect.Array;
import java.util.*;

public class PracticeQuestions {
    public static void main(String[] args) {
        PracticeQuestions object = new PracticeQuestions();
        char value = object.findTheDifference("ymbgaraibkfmvocpizdydugvalagaivdbfsfbepeyccqfepzvtpyxtbadkhmwmoswrcxnargtlswqemafandgkmydtimuzvjwxvlfwlhvkrgcsithaqlcvrihrwqkpjdhgfgreqoxzfvhjzojhghfwbvpfzectwwhexthbsndovxejsntmjihchaotbgcysfdaojkjldprwyrnischrgmtvjcorypvopfmegizfkvudubnejzfqffvgdoxohuinkyygbdzmshvyqyhsozwvlhevfepdvafgkqpkmcsikfyxczcovrmwqxxbnhfzcjjcpgzjjfateajnnvlbwhyppdleahgaypxidkpwmfqwqyofwdqgxhjaxvyrzupfwesmxbjszolgwqvfiozofncbohduqgiswuiyddmwlwubetyaummenkdfptjczxemryuotrrymrfdxtrebpbjtpnuhsbnovhectpjhfhahbqrfbyxggobsweefcwxpqsspyssrmdhuelkkvyjxswjwofngpwfxvknkjviiavorwyfzlnktmfwxkvwkrwdcxjfzikdyswsuxegmhtnxjraqrdchaauazfhtklxsksbhwgjphgbasfnlwqwukprgvihntsyymdrfovaszjywuqygpvjtvlsvvqbvzsmgweiayhlubnbsitvfxawhfmfiatxvqrcwjshvovxknnxnyyfexqycrlyksderlqarqhkxyaqwlwoqcribumrqjtelhwdvaiysgjlvksrfvjlcaiwrirtkkxbwgicyhvakxgdjwnwmubkiazdjkfmotglclqndqjxethoutvjchjbkoasnnfbgrnycucfpeovruguzumgmgddqwjgdvaujhyqsqtoexmnfuluaqbxoofvotvfoiexbnprrxptchmlctzgqtkivsilwgwgvpidpvasurraqfkcmxhdapjrlrnkbklwkrvoaziznlpor","qhxepbshlrhoecdaodgpousbzfcqjxulatciapuftffahhlmxbufgjuxstfjvljybfxnenlacmjqoymvamphpxnolwijwcecgwbcjhgdybfffwoygikvoecdggplfohemfypxfsvdrseyhmvkoovxhdvoavsqqbrsqrkqhbtmgwaurgisloqjixfwfvwtszcxwktkwesaxsmhsvlitegrlzkvfqoiiwxbzskzoewbkxtphapavbyvhzvgrrfriddnsrftfowhdanvhjvurhljmpxvpddxmzfgwwpkjrfgqptrmumoemhfpojnxzwlrxkcafvbhlwrapubhveattfifsmiounhqusvhywnxhwrgamgnesxmzliyzisqrwvkiyderyotxhwspqrrkeczjysfujvovsfcfouykcqyjoobfdgnlswfzjmyucaxuaslzwfnetekymrwbvponiaojdqnbmboldvvitamntwnyaeppjaohwkrisrlrgwcjqqgxeqerjrbapfzurcwxhcwzugcgnirkkrxdthtbmdqgvqxilllrsbwjhwqszrjtzyetwubdrlyakzxcveufvhqugyawvkivwonvmrgnchkzdysngqdibhkyboyftxcvvjoggecjsajbuqkjjxfvynrjsnvtfvgpgveycxidhhfauvjovmnbqgoxsafknluyimkczykwdgvqwlvvgdmufxdypwnajkncoynqticfetcdafvtqszuwfmrdggifokwmkgzuxnhncmnsstffqpqbplypapctctfhqpihavligbrutxmmygiyaklqtakdidvnvrjfteazeqmbgklrgrorudayokxptswwkcircwuhcavhdparjfkjypkyxhbgwxbkvpvrtzjaetahmxevmkhdfyidhrdeejapfbafwmdqjqszwnwzgclitdhlnkaiyldwkwwzvhyorgbysyjbxsspnjdewjxbhpsvj");
        System.out.println(value);
    }


    public char findTheDifference(String s, String t) {
        int result = 0;

        // XOR all characters of s
        for (char c : s.toCharArray()) {
            result ^= c;
        }

        // XOR all characters of t
        for (char c : t.toCharArray()) {
            result ^= c;
        }

        // The result will be the extra character in t
        return (char) result;
    }

    //657.Robot return to origin
    public boolean judgeCircle(String moves) {
        int vertical = 0;
        int horizonatal = 0;
        char[] movearray = moves.toCharArray();
        for(char c : movearray){
            if(c == 'U'){vertical = vertical+1;}
            if(c=='D'){vertical = vertical -1;}
            if(c=='L'){horizonatal = horizonatal -1;}
            if(c=='R'){horizonatal = horizonatal+1;}
        }
        if(horizonatal==0 && vertical == 0){return true;}
        return  false;
    }






    //771. Jewels and Stones
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelsList = new HashSet<>();
//        char[] jewelslist = jewels.toCharArray();
        int count =0;
        for(char c : jewels.toCharArray()){
            jewelsList.add(c);
        }
        char[] stonelist = stones.toCharArray();
        for(char c :stonelist){
            if(jewelsList.contains(c)){
                count = count + 1;
            }
        }
        return count;
    }



    public String[] findOcurrences(String text, String first, String second) {
        String[] arrayofwords = text.split(" ");
        int v =0 ;
        ArrayList<String> answer = new ArrayList<>();
        for(int i =0;i<arrayofwords.length-2;i++){
            if(arrayofwords[i].equals(first)){
                if(arrayofwords[i+1].equals(second)){
                    if(i+1<arrayofwords.length ){
                        if(arrayofwords[i+2] != arrayofwords[i] && arrayofwords[i+2]!= arrayofwords[i+1]){

                            answer.add(arrayofwords[i+2]);
                        }
                    }
                }
            }
        }
        return answer.toArray(new String[0]);
    }


    public boolean isvalidparanthesis(String word){
        Stack<Character> stack = new Stack<>();
        for(char c : word.toCharArray()){
            if(c=='('||c=='{'||c == '['){
                stack.push(c);
            }else {
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if((c==')') && top != '(' || (c==']') && top != '[' || (c=='}') && top != '{' ){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
