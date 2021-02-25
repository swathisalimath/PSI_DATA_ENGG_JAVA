class Bank
{
	int getroi()
	{
	return 2;
	}
}

class SBI extends Bank
{
	int getroi()
	{
	return 7;
	}
}

class ICICI extends Bank
{
	int getroi()
	{
	return 8;
	}
}

class Axis extends Bank
{
	int getroi()
	{
	return 7;
	}
}

class main
{
	public static void main(String[] args)
	{
		SBI s = new SBI();
		ICICI i = new ICICI();
		Axis a = new Axis();
		Bank b= new Bank();
		Bank c=new SBI();
		System.out.println("SBI Rate of interest is "+s.getroi()+"%");
		System.out.println("ICICI Rate of interest is "+i.getroi()+"%");
		System.out.println("Axis Rate of interest is "+a.getroi()+"%");
		System.out.println("Normal Rate of interest is "+b.getroi()+"%");
		System.out.println("SBI override bank Rate of interest is "+c.getroi()+"%");
	}
}