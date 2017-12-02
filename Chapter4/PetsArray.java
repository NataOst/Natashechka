class PetsArray {
	
	public static void main(String[] args) {
		GoodDog[] pets;
		pets = new GoodDog[7];
		pets[0] = new GoodDog();
		pets[1] = new GoodDog();
		pets[0].setSize(30);
		int x = pets[0].getSize();
		pets[1].setSize(8);
		int y = pets[1].getSize();
		System.out.println("The size of the first dog : " + x);
		System.out.println("The size of the second dog : " + y);
	}
}