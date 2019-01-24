package Chap1.MySolutions;

public class Q4 {


    public static boolean isAnagram(String S1, String S2){
        int[] charCounts = new int[256];

        for(int i=0; i<S1.length(); i++)charCounts[S1.charAt(i)]++;
        for(int i=0; i<S2.length(); i++)charCounts[S2.charAt(i)]--;
        for(int i=0; i<256;i++)if(charCounts[i] != 0)return false;

        return true;
    }



    public static void main(String[] args){
        System.out.println(isAnagram("actors", "costar"));
    }
}
