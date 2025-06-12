package Ternary_Operator;

public class Lab005_Age_Classification {
    public static void main(String[] args) {
        //   age = 23
        //   age < 18 ->  Minor
        //   18 < age > 65 ->  Adult
        //   age > 65 -> Senior Citizen

        int age = 69;
        String Result = (age < 18) ? "Minor": (age > 65)? "Senior Citizen":"Adult";
        System.out.println(Result);
    }
}
