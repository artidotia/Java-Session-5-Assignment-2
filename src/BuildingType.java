
public class BuildingType {
	public static void main(String args[]){
		Building bd = new Building(); //creates a new object of type Building
		//when we print the default values
		bd.showDetails("Building's Default Values");
		
		Bunglow bglow = new Bunglow(0, 6, 5, "Raj Mahal", true);
		System.out.println();
		bglow.showDetails("BUNGLOW");
		
		LowRiseBuilding lrbd = new LowRiseBuilding(3, 3, 2, "Green Ville Low Rise", true, false);
		System.out.println(); 
		lrbd.showDetails("Low Rise Building");
		
		MidRiseBuilding mrbd = new MidRiseBuilding(10, 3, 3, "Green Ville Mid Rise", true, true, 2, false);
		System.out.println(); 
		mrbd.showDetails("Mid Rise Building");
		
		HighRiseBuilding hrbd = new HighRiseBuilding(30, 5, 5, "Green Ville High Rise", true, true, 4, true, true);
		System.out.println(); 
		hrbd.showDetails("High Rise Building");
		
	}
}
