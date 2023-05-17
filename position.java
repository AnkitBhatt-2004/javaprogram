import java.util.*;
public class position {

    public static void main(String args[]) {
    int []arr={19,17,15,28,93,65,75,0};
    int i,pos=4;
    for(i=arr.length-1;i>pos-1;i--) {
        arr[]=arr[i-1];

    arr[pos-1]=100;

    for(i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }

    }
    }  
}  