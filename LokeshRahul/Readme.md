Problem statement:
Given two integers N and K, the task is to rotate the digits of N by K. If K is a positive integer, left rotate its digits. Otherwise, right rotate its digits. Input: N = 12345, K = 2 Output: 34512 Explanation: Left rotating N(= 12345) by K(= 2) modifies N to 34512. Therefore, the required output is 34512

Input: N = 12345, K = -3 Output: 34512 Explanation: Right rotating N(= 12345) by K( = -3) modifies N to 34512. Therefore, the required output is 34512

Program:
import java.io.*; 
class Main { 
	static int numberOfDigit(int N) 
	{ 
		int digit = 0; 
		while (N > 0) { 
			digit++; 
			N /= 10; 
		} 
		return digit; 
	} 
	static void rotateNumberByK(int N, int K) 
	{ 
		int X = numberOfDigit(N); 
		K = ((K % X) + X) % X; 
		int left_no = N / (int)(Math.pow(10, X - K)); 
		N = N % (int)(Math.pow(10, X - K)); 
		int left_digit = numberOfDigit(left_no); 
		N = (N * (int)(Math.pow(10, left_digit))) 
			+ left_no; 
		System.out.println(N); 
	} 
	public static void main(String args[]) 
	{ 
		int N = 12345, K = 7; 
		rotateNumberByK(N, K); 
	} 
} 
Ouput