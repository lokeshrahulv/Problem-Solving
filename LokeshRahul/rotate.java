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
