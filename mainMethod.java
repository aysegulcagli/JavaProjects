import java.util.Scanner;

public class mainMethod {
    public static void main(String[] args) {
        getname();
        getsurname();
        getname();
    }

    public static void getname(){
        System.out.println("Enter your name: ");
        Scanner newObject = new Scanner(System.in);
        String name = newObject.nextLine();
        System.out.println("Your name is: "+name);
        
    }
    public static void getsurname(){
        System.out.println("Enter your surname: ");
        Scanner newObject2 = new Scanner(System.in);
        String surname = newObject2.nextLine();
        System.out.println("Your surname is: "+surname);

    }
}
