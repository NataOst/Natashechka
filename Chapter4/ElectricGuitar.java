class ElectricGuitar {

	String brand;
	int numOfPickups;
	boolean rockStarUsesIt;

	String getBrand() {
		return brand;
	}

	void setBrand(String aBrand) {
		brand = aBrand;
	} 

	int getNumOfPickups() {
		return numOfPickups;
	}

	void setNumOfPickups(int num) {
		numOfPickups = num;
	}

	boolean getRockStarUsesIt() {
		return rockStarUsesIt;
	}

	void setRockStarUsesIt(boolean yesOrNo) {
		rockStarUsesIt = yesOrNo;
	}
	
	public static void main(String[] args) {
		ElectricGuitar guitar = new ElectricGuitar();
		guitar.setRockStarUsesIt(true);
		guitar.setNumOfPickups(8);
		guitar.setBrand("Yamaha");
		System.out.println("Brand : " + guitar.getBrand());
		System.out.println("Number of pickups : " + guitar.getNumOfPickups());
		System.out.println("Rock star uses it : " + guitar.getRockStarUsesIt());
	}
}




