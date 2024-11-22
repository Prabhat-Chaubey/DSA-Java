package strings;

public class ReverseString  {
    public static void main(String[] args) {
        ReverseString object = new ReverseString();
        char[] s={'H','a','n','n','a','h'};
        char[] output = object.reverseString(s);
        System.out.println(output);
    }
    public char[]  reverseString(char[] s) {
        int rightpointer = (s.length)-1;
        int leftpointer= 0;
        while (leftpointer<=rightpointer){
            char temp = s[rightpointer];
            s[rightpointer] = s[leftpointer];
            s[leftpointer] = temp;
            leftpointer = leftpointer +1;
            rightpointer = rightpointer -1;
        }

        return s;
    }
}
