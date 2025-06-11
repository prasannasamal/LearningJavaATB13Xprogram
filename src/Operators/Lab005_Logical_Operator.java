package Operators;

public class Lab005_Logical_Operator {
    public static void main(String[] args) {
        //&& and gate
        // || or gate
        boolean a = true;
        System.out.println(!a);
         boolean b= true;
        System.out.println(!!b);

        boolean c = true || false;
        boolean c1 = true && false;
        System.out.println(c);

        System.out.println(c1);

    }
}
