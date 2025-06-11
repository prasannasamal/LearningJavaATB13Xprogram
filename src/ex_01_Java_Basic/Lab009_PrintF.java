package ex_01_Java_Basic;

public class Lab009_PrintF {
    public static void main(String[] args) {
        int a = 10;

        System.out.print("print command print without the new line");
        System.out.println(" Helo World ");
        System.out.println(" add the new line in the end ");
        // Note
        // Print Command-> print command print without the new line
        //Println Command-> Print with a new line
        // printF command-> Format your variable

        System.out.println(a);
        System.out.printf("your variable name is %d", a);

        // %d -> int, byte, short, long - Data Type
        // %s -> string
        // %f -> float, double
        // %b -> boolean
        int b =20;
        System.out.println("_____");
        System.out.printf("%d + %d",a,b);
    }
}
