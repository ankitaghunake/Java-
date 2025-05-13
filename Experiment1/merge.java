import java.util.*;
public class merge{
    public static void merged(int[] arr1,int[] arr2,int[] c , int a,int b)
{
    int i=0;
    int j=0;
    int k=0;
    while(i<a && j<b){
        if(arr1[i]<arr2[j])
        {
            c[k]=arr1[i];
            i++;
            k++;
        }
    }
    while(i<a){
        c[k]=arr1[i];
        i++;
        k++;
    }
}
public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the size of arr1: ");
    int a = sc.nextInt();
    int[] arr1= new int[a];

    System.out.println("Enter the size of arr2: ");
    int b = sc.nextInt();
    int[] arr1= new int[b];

    int total= a+b;
    int[] c = new 

}
}