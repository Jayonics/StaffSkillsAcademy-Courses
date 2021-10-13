import java.util.*;
public class module22 {
    public static void main (String[] args){
        Scanner ageGetter = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = ageGetter.nextInt();
        if(age >= 18){
            System.out.println("You can legally drink!");
        }

    }
}
