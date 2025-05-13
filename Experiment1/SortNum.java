import java.util.*;
public class SortNum{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
int[] nums = new int[10];
System.out.println("Enter the 10 numbers: ");


for (int i=0;i<10;i++)
nums[i]=sc.nextInt();
Arrays.sort(nums);
System.out.println("Sorted numbers: ");

for (int n: nums)

System.out.println(n+"");

}
}