package Chap1;

public class MainTest {

    public static boolean isSubstring(String superStr, String subStr){
        if (superStr.indexOf(subStr) >=0)return true;


        return false;
    }


    public static boolean isRotation(String s1, String s2){
        if(s1.length() != s2.length())return false;

        String concatStr = s2 + s2;
        if(isSubstring(concatStr, s1))return true;

        return false;
    }

    public static void main(String[] args) {
        String s1 = "Apple";
        String s2 = "pleAp";

    System.out.print(isRotation(s1, s2));
    }



}
