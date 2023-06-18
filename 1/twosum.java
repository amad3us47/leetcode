import java.util.*;
class twosum
{
public static void main(String args[])
{
    Scanner in =new Scanner(System.in);
    int arr[]={1,2,3,4,5,6,7,8,9};
    System.out.println("Enter the number");
    int target=in.nextInt();
    for(int i=0;i<arr.length;i++)     //looping through the elements in array
    {
      int find = target - arr[i];      
      for(int j=0;j<arr.length;j++)    
    {   
        if(find==arr[j])              //finding the number in second loop after subracting the first index from the target
      {
          System.out.println(arr[i]+"  "+find);
        }
      }
    }
}
}
