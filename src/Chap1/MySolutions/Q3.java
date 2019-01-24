package Chap1.MySolutions;

public class Q3 {

    public static void dupRem(char[] str){
        if(str.length<=1)return;

        int tail = 1;

        for(int i=1; i<str.length; i++){
            for(int j=0; j<tail;j++){
                if(str[i] == str[j])break;
                if(j==tail-1){
                    str[tail] = str[i];
                    tail++;
                }
            }
        }
        str[tail] = 0;
    }



    public static void dupRemExtraBuffer(char[] str){
        if(str.length<=1)return;

        int tail = 1;

        boolean[] charHit = new boolean[256];

        for(int i=1; i<str.length; i++){
            if(charHit[str[i]] == false){
                str[tail++] = str[i];
                charHit[str[i]] = true;
            }
        }

        str[tail] = 0;
    }




    public static String charArrayToString(char[] array) {
        StringBuilder buffer = new StringBuilder(array.length);
        for (char c : array) {
            if (c == 0) {
                break;
            }
            buffer.append(c);
        }
        return buffer.toString();
    }



    public static void main(String[] args){
        String test = "Hello World";
        char[] testChar = test.toCharArray();
        dupRemExtraBuffer(testChar);

        System.out.println(charArrayToString(testChar));
    }

}
