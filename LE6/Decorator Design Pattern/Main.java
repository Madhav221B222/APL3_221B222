public class Main
{
	public static void main(String[] args) {
	    Offering offering1 = new Coffee();
	    offering1 = new Rum(offering1);
	    offering1 = new Gin(offering1);
		System.out.println(offering1.getName()+" //Rs."+offering1.getPrice());
		Offering offering2 = new Tea();
	    offering2 = new Soda(offering2);
		System.out.println(offering2.getName()+" //Rs."+offering2.getPrice());
		Offering offering3 = new IceCream();
	    offering3 = new RoohAfza(offering3);
		System.out.println(offering3.getName()+" //Rs."+offering3.getPrice());
	}
}
