    import  java.util.Scanner;
public class deletion {

     static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int i,j,n;
    System.out.println("Enter no of element is array");
    n=sc.nextInt();
    int a[]=new int [n+1];
        for(i=0;i<n;i++){
            System.out.println("Enter element "+(i+1));
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element ");
        int element=sc.nextInt();
        for(i=0;i<a.length;i++){      
           if (a[i]==element){
           for(j=i;j<n;j++){
           }
           }
        }
    for(i=0;i<n;i++){
        System.out.println(a[i]);
    }    
    }     
    



    
}
