import java.util.Scanner;
public class hello {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name: ");
    String name = sc.nextLine();
    name=name.replace(" ","_");
    System.out.println();

    }
    
}
