
public class Bunglow extends Building{
	boolean hasGarden;
	
	public Bunglow(int noOfFloors, int noOfRooms, int noOfBathrooms, String buildingName, boolean hasGarden) {
		super(noOfFloors, noOfRooms, noOfBathrooms, buildingName);
		this.hasGarden = hasGarden;
	}
	
	void showDetails(String nm){
		super.showDetails(nm);
		if (hasGarden) 
			System.out.println("Bunglow has a garden!");
		else System.out.println("Bunglow doesn't have a garden!");
	}
}
