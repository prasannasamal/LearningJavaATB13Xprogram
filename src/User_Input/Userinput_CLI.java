package User_Input;

public class Userinput_CLI {
    public static void main(String[] args) {
      String age_String = args[0];
        int age = Integer.parseInt(age_String); // convert string to int using paseInt()
       //  int age = 65;
        System.out.println(age);
        String canIvote = age > 18 ? "yes" : "No";
        System.out.println(canIvote);

    }


}