package Chap1.MySolutions;

public class Q1 {


    public static boolean containsDuplicateCharWithNoAdditionalArray(String str){

        for(int i=1; i<str.length(); i++){
            for(int j=0;j<i; j++){
                if(str.charAt(j) == str.charAt(i))return true;
            }
        }
        return  false;
    }

    public static boolean containsDuplicateCharAdditionalArray(String str){
        boolean[] allChar = new boolean[256];

        for(int i=0;i<str.length();i++){
            if(allChar[str.charAt(i)])return true;
            allChar[str.charAt(i)] = true;
        }

        return false;
    }


    public static boolean containsDuplciateBitVector(String str){
        int checker = 0;

        for(int i=0; i<str.length(); i++){
            int val = (int)str.charAt(i) - 'a';

            if( (checker & (1 << val)) > 0)return true;

            checker = checker | (1 << val);
        }


        return false;
    }


    public static void main(String[] args){
        System.out.println(containsDuplciateBitVector("abca"));
    }
}
