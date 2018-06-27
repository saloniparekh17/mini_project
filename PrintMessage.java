class PrintMessage
{
	public static void main(String args[])
	{
		int num=7;
		if (num%3 == 0)
			System.out.println(num+" is divisible by 3");
		else if(num%5==0)
			System.out.println(num+" is divisible by 5");
		else
			System.out.println(num+" is not divisible by 3 and 5");
	}
}
