### Problem Statement: "Apartment and Car Purchase Estimator"
#### You are required to develop a Java program that helps users determine how many cars they can buy within their budget and estimate the cost of an apartment based on its size.

### Requirements:
Car Purchase Calculation:

The user enters the amount of money they have.

Each car costs ₹450,000.

The program should calculate and display how many cars the user can buy with their available money.

If the user cannot afford a car, display an appropriate message.

Apartment Cost Estimation:

The apartment cost is calculated based on a rate of ₹50,000 per square foot.

The program should estimate the cost of an apartment with a fixed size of 105 square feet and display the total cost.

Input Format:
An integer representing the amount of money the user has.

Output Format:
The number of cars the user can buy.

The total cost of the apartment of size 105 sqft.

Example Execution:
Input:
Enter the money you have !!!  
1000000
Output:
How many cars you want to buy  
You can buy 2 car  
Cost of apartment you want to buy 5250000  
### Program :
```java
import java.util.Scanner;
class Buy {
    public void Apartment(int sqft){
        int costofoneSq = 50000;
        int cost = sqft * costofoneSq;
        System.out.println("Cost of apartment you want to buy "+cost);

    }
    public void Car(int moneyhave)
    {
        int cost;
        cost=450000;
        
        System.out.println("How many car you want to buy");
        
        int countofcar=0;
        while(moneyhave>=cost)
        {
            countofcar++;
            moneyhave -= cost;
        }
        if(countofcar > 0){
         System.out.println("You can buy "+countofcar+" car");
        }
        else{
            System.out.println("You cannot buy a car");
        }
              
    }
}
public class Mercedez {
    public static void main(String []a)
    {
        Scanner scan = new Scanner(System.in);
        Buy b = new Buy();
        System.out.println("Enter the money you have !!!");
        int moneyhave = scan.nextInt();
        b.Car(moneyhave);
        b.Apartment(105);

    }
}

```

### Output :
![Uploading Screenshot 2025-03-24 141240.png…]()



