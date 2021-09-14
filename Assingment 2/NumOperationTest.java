import java.io.*;
import NumOperation.PrimeNumber;
import NumOperation.PerfectNumber;
import NumOperation.ArmstrongNumber;

public class NumOperationTest
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		PrimeNumber prime = new PrimeNumber(n);
		PerfectNumber perfect = new PerfectNumber(n);
		ArmstrongNumber armstrong = new ArmstrongNumber(n);
		
	}
}


		`