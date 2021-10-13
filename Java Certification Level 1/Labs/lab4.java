import java.io.*;
import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {

        Scanner grab = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = grab.nextLine();
        System.out.println("What's your email?");
        String mail = grab.nextLine();
        System.out.println("What's your favorite band?");
        String band = grab.nextLine();

        String fName = name.replaceAll(" ", "") + ".txt";


        try {
            PrintWriter saver = new PrintWriter(fName);

            saver.println("Name:" + name);
            saver.println("Email:" + mail);
            saver.println("Band:" + band);
            saver.close();
        } catch (FileNotFoundException e) {
            System.out.println("Oh no, it didn't work!");
        }
        System.out.println(name + "|" + mail + "|" + band + " has been stored to " + name + ".txt.");

    }
}