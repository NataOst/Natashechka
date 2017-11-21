class Dog {

	int size;
	String name;

	void bark(int count) {
		for (int i = 0; i < count; i++) {
			if (size > 60) {
				System.out.println("Ãàâ Ãàâ!");
			} else if (size > 14) {
				System.out.println("Òÿô Òÿô!");
			} else {
				System.out.println("Âóô Âóô!");	
			}
		}
	}
}

class DogTestDrive {

	public static void main(String[] args) {
		Dog one = new Dog();
		one.size = 70;
		Dog two = new Dog();
		two.size = 8;
		Dog three = new Dog();
		three.size = 35;

		one.bark(5);
		two.bark(10);
		three.bark(15); 
	}	
}