class Bank {
	int getroi(){return 0;}
}
class SBI extends Bank {
	int getroi(){return 8;}
	}
class ICICI extends Bank {
	int getroi(){return 7;}
	}
class Axis extends Bank {
	int getroi(){return 6;}
	}
class Test{
	public static void main(String args[]){
		SBI s=new SBI();
		ICICI i=new ICICI();
		Axis a=new Axis();
		System.out.println("SBI ROI: "+s.getroi());
		System.out.println("ICICI ROI: "+i.getroi());
		System.out.println("AXIS ROI: "+a.getroi());
	}
}
	
	