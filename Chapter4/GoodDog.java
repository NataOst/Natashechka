class GoodDog {

	private int size;

	public int getSize() {
		return size;  
	}
	public void setSize(int s){
		size = s;
	}
	void bark (int count) {
		for (int i = 0; i < count; i++) {
			if (size > 60) {
				System.out.println("Gav! Gav!");
			} else if (size > 14) {
				System.out.println("Vuf! Vuf!");
			} else {
				System.out.println("Tyaf!Tyaf!");
			}
		}
	}
}

class GoodDogTestDrive {

	public static void main(String[] args) {
		GoodDog one = new GoodDog();
		one.setSize(70);
		GoodDog two = new GoodDog();
		two.setSize(8);
		System.out.println("The first dog: " + one.getSize());
		System.out.println("The second dog: " + two.getSize());
		one.bark(12);
		two.bark(15);
	}
}
