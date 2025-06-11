package Operators;

public class Lab007_Exercise_Concat_Plus {
    public static void main(String[] args) {
        String first_name = "Prasanna";
        String middle_name = "Kumar";
        String last_Name = "Samal";

        int a = 10;
        int b = 10;
        System.out.println(first_name + middle_name + last_Name + a + b);
        System.out.println( a + b + first_name + middle_name + last_Name);
        System.out.println(first_name + middle_name + last_Name + (a + b ));

    }
}
