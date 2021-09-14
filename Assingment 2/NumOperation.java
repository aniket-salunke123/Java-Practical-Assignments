package NumOperation;

import java.lang.Math;

public class PrimeNumber
{
	public PrimeNumber(int n)
	{
		int m = n/2;
		int flag = 0;
		if(n == 0 || n == 1)
		{
			System.out.println(n + " is not a prime number");
		}
		else
		{
			for (int i=2; i<=m; i++) 
			{
				if (n%i == 0)
				{
					System.out.println(n + " is not a prime number");					
					flag = 1;
					break;

				}
				
			}
			if(flag == 0)
			{
				System.out.println(n + " is a Prime Number");
			}
		}
	}
}

public class ArmstrongNumber
{
	public ArmstrongNumber(int n)
	{
		int temp, digits=0, last=0, sum=0;    
		temp=n;   
		while(temp>0)    
		{   
			temp = temp/10;   
			digits++;   
		}   
		temp = n;   
		while(temp>0)   
		{         
			last = temp % 10;   
			sum +=  (Math.pow(last, digits));   
			temp = temp/10;   
		}  
		if(n==sum)   
			System.out.println(n + " is Armstrong Number");      
		else
			System.out.println(n + " is not an Armstrong Number");   

	}

}

public class PerfectNumber
{
	public PerfectNumber(int n)
	{
		int sum=0;
		int i=1;  
		//executes until the condition becomes false  
		while(i <= n/2)  
		{  
			if(n % i == 0)  
			{  
				//calculates the sum of factors  
				sum = sum + i;  
			} //end of if  
			//after each iteration, increments the value of variable i by 1  
			i++;  
		} //end of while  
		//compares sum with the number  
		if(sum==n)  
		{  
			//prints if sum and n are equal  
			System.out.println(n+" is a perfect number.");  
		} //end of if  
		else  
			//prints if sum and n are not equal  
			System.out.println(n+" is not a perfect number."); 
	}
}