package Ternary_Operator;

public class Lab003_Minimum_Maximum {
    public static void main(String[] args) {
        int a = 17;
        int b = 15;
        int min = a > b ? b : a ;
        int max = a < b ? b : a ;
        System.out.println(min);
        System.out.println(max);
    }
}
