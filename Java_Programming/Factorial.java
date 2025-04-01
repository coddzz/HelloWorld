// n! = 1 x 2 x 3 x.. x n

public class Factorial {
    public static void main(String[] args){

        int num =5, fact =1;
        for (int i=1; i<=num ;++i){
            fact *= i;
        }
        System.out.println("Factorial of "+ num+ " is "+ fact);
    }
}
