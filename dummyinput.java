import java.util.*;

public class dummyinput {
    public static void main(String[] args) {
        Scanner a =new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = a.nextInt();

        a.nextLine(); //dummy input
        System.out.println("Enter your name: ");
        String name = a.nextLine();
        System.out.println("Your name is: "+name+"\nYour age is: "+age);
    }
    
}
