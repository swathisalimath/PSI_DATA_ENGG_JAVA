class Adder
{
	static int add(int a, int b)
	{
	return a+b;
	}
	static double add(double a, double b)
	{
	return a+b;
	}
	static int add(int a, double b)
	{
	return (a+(int)b);
	}
	static double add(int a, double b,int c,double d)
	{
	return ((double)a+b+(double)c+d);
	}
}
class TestOverloading
{
	public static void main(String[] args)
	{
		System.out.println(Adder.add(12,12));
		System.out.println(Adder.add(12.5,12.1));
		System.out.println(Adder.add(12,12.2));
		System.out.println(Adder.add(12,12.4,12,12.4));
	}
}