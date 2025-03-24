import java.util.*;
public class bubble {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int row;
        int arr[]=new int[num];
        for(row=0;row<num;row++)
        {
            arr[row]=sc.nextInt();
        }
        bubble(arr,num);
        System.out.println("Sorted array is:");
        print(arr,num);
    }
    public static void bubble(int arr[],int num)
    {
        for(int i=0;i<num;i++)
        {
            for(int j=1;j<num-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void print(int arr[],int num)
    {
        for(int row=0;row<num;row++)
        {
            System.out.print(arr[row]+" ");
        }
    }
}
