# Bubble Sort
## Problem statement:
Write a Java program that takes an integer N as input, representing the number of elements in an array. The program should then read N integers into an array and sort them using the Bubble Sort algorithm. After sorting, the program should display the sorted array as output.

Example:
Input:
5  
64 34 25 12 22  
Output:
Sorted array is:  
12 22 25 34 64  
## Program:
```java
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
```
## Ouput
![Screenshot 2025-03-24 142056](https://github.com/user-attachments/assets/e5d86585-5d4c-448e-96c9-e4f98f0deea0)
