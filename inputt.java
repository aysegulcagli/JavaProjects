import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class inputt {
    public static void main(String[] args) {
        float ca=3;
        Double bab= 3.15;
        System.out.println(ca);
        System.out.println(bab);
        Scanner a =new Scanner(System.in);

        System.out.println("Enter your age: \n"+"your num");
        int age = a.nextInt();
        int num = a.nextInt();
        System.out.println("Your age is: "+age+"\n"+"Your num is: "+num);
        int myAge =22;
        System.out.println("My age is: "+(age-myAge));
        int yourAge=a.nextInt();
        System.out.println("Your age is: "+yourAge);

        Scanner b =new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = b.nextLine();
        System.out.println("Your name is: "+name);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        if(scanner.hasNextInt()){
            int c =scanner.nextInt();
            System.out.println("You entered: "+c);

        }
        else{
            System.out.println("Invalid input");
        }
    }
    
}
