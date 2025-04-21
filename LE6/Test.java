public class Test
{
	public static void main(String[] args) {
		Offering offering = new Coffee();
		offering = new Rum(offering);
		offering = new Gin(offering);
		offering = new Icecream(offering);
		offering = new Milk(offering);
		System.out.println(offering.getName() + " " + offering.getPrice());
	}

}
