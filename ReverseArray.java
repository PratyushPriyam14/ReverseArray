import java.io.*;
import java.util.*;
public class ReverseArray {
    public static void main(String[]args)throws Exception{
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        displayarrrevese(arr,0);
    }
    public static void displayarrrevese(int []arr,int index)
    {
        if(index==arr.length){
            return;
        }
        displayarrrevese(arr,index+1);
        System.out.print(arr[index]+" ");
    }
}
