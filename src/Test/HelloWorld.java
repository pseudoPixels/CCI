package Test;

public class HelloWorld {



    public static int fib(int number){
        if(number == 0)return 0;
        if(number == 1)return 1;
        return fib(number-1) + fib(number-2);
    }


    public static void main(String[] args){
        System.out.print(fib(10));

    }





}
