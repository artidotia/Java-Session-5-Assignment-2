
public class MidRiseBuilding extends Building {
	boolean hasGatedSecurity;
	boolean hasStore;
	int noOfFlats;
	boolean hasSwimmingPool;
	
	public MidRiseBuilding(int noOfFloors, int noOfRooms, int noOfBathrooms, String buildingName, 
			               boolean hasGatedSecurity, boolean hasStore, int noOfFlats, boolean hasSwimmingPool) {
		super(noOfFloors, noOfRooms, noOfBathrooms, buildingName);
		this.hasStore = hasStore;
		this.hasGatedSecurity = hasGatedSecurity;
		this.hasSwimmingPool = hasSwimmingPool;
		this.noOfFlats = noOfFlats;
	}
	
	void showDetails(String nm){
		super.showDetails(nm);
		System.out.println("Number of flats on each floor: " + noOfFlats);
		if (hasGatedSecurity) 
			System.out.println("Building has a gated security!");
		else System.out.println("Building doesn't have a gated security!");
		if (hasStore) 
			System.out.println("Building has a departmental store!");
		else System.out.println("Building doesn't have a departmental store!");
		if (hasSwimmingPool) 
			System.out.println("Building has a swimming pool!");
		else System.out.println("Building doesn't have a swimming pool!");
	}

}
