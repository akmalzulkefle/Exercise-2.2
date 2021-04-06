public class Motorcycle {
	
	void printMotorcycle(String b, int e, String c, String t){
		System.out.println("Brand : " + b);
		System.out.println("Engine : " + e + "CC");
		System.out.println("Colour : " + c);
		System.out.println("Type : " + t);
	}
	
	void printSpeed(int g1, int g2, int g3, int g4, int g5, int g6) {
		System.out.println("Gear 1 : " + g1 + " KM/H " + "(TOP SPEED)");
		System.out.println("Gear 2 : " + g2 + " KM/H " + "(TOP SPEED)");
		System.out.println("Gear 3 : " + g3 + " KM/H " + "(TOP SPEED)");
		System.out.println("Gear 4 : " + g4 + " KM/H " + "(TOP SPEED)");
		System.out.println("Gear 5 : " + g5 + " KM/H " + "(TOP SPEED)");
		System.out.println("Gear 6 : " + g6 + " KM/H " + "(TOP SPEED)");
	}
	
	void printPrice(int p) {
		System.out.println("Price : RM " + p + ",000"); 
	}
	
	void behavior(String b) {
		System.out.println("Behavior : " + b);
	}
	
}
