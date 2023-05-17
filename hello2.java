import java.util.Scanner;

import java.util.Scanner;
public class hello2 {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name: ");
    String name = sc.nextLine();
    String rev=" ";
    int alphac=0,digitc=0;
    for(int i=0;i<name.length();i++){
        char ch=name.charAt(i);
        if(Character.isUpperCase(ch)){
            alphac+=1;
        }
        else if(Character.isLowerCase(ch)){
                alphac+=1;
            }else if(Character.isDigit(ch)){
                digitc+=1;
            }
        }
        System.out.println(((float)alphac/name.length())*100);
        System.out.println(((float)digitc/name.length())*100);
        
    }
        }
