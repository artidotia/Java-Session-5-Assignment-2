
public class LowRiseBuilding extends Building{
	boolean hasGatedSecurity;
	boolean hasStore;
	
	public LowRiseBuilding(int noOfFloors, int noOfRooms, int noOfBathrooms, String buildingName, 
			               boolean hasGatedSecurity, boolean hasStore) {
		super(noOfFloors, noOfRooms, noOfBathrooms, buildingName);
		this.hasStore = hasStore;
		this.hasGatedSecurity = hasGatedSecurity;
	}
	
	void showDetails(String nm){
		super.showDetails(nm);
		if (hasGatedSecurity) 
			System.out.println("Building has a gated security!");
		else System.out.println("Building doesn't have a gated security!");
		if (hasStore) 
			System.out.println("Building has a departmental store!");
		else System.out.println("Building doesn't have a departmental store!");
	}

}
