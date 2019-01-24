package Chap1.MySolutions;


public class Q8 {

    public static boolean isRotation(String S1, String S2){
        if(S1.length() == S2.length() && S1.length() > 0){
            String S1S1 = S1 + S1;
            if (S1S1.indexOf(S2) > 0 )return true;
        }
        return false;
    }


    public static void main(String[] args){
        System.out.println(isRotation("PLEAP", "APPLE"));
    }

}
