/*
	Define a class MyNumber having one private int data member. Write a default constructor to
initialize it to 0 and another constructor to initialize it to a value (Use this). Write methods to check whether this data member is Negative, Positive, Zero, Odd or Even. Create an object in main. Use command line arguments to pass a value to the object (Hint: convert string argument to integer) and perform the above checking.
*/
class MyNumber
{
private
	int num;
public

	MyNumber()
	{
		num = 0;
	}

	MyNumber(int num)
	{
		this.num = num;
	}

	void checkNum()
	{
		if (this.num > 0)
			System.out.println("Number is Positive");
		else if(this.num < 0)
			System.out.println("Number is Negative");
		else if(num == 0)
			System.out.println("Number is Zero");
	}

	void checkEvenOdd()
	{
		if (this.num % 2 == 0)
			System.out.println("Number is Even");
		else
			System.out.println("Number Is Odd");
	}

}

class MyNumberDemo
{
	public static void main(String[] args) 
	{
		if(args.length != 1)
		{
			System.out.println("enter One Number Only as a Command Line Argument");
			System.exit(0);
		}

		MyNumber Mn = new MyNumber(Integer.parseInt(args[0]));

		Mn.checkNum();
		Mn.checkEvenOdd();

	}
}