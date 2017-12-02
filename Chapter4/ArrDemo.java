public class ArrDemo {

	public static void main(String[] args) {
		Child [] children = new Child[10];
		for (int i = 0; i < 10; i++) {
			children[i] = new Child();
			children[i].setName("Masha " + (i + 1));
			children[i].setAge(i * 2);
			children[i].setHeight(i + 2); 
		}
		int j = 0;
		while (j < 10) {
			System.out.println("The name is " + children[j].getName() + " The age is " + children[j].getAge() + " The height is " + children[j].getHeight());
			j = j + 1;		
		}
		j = 9;
		while (j > 0) {
			System.out.println("The name is " + children[j].getName() + " The age is " + children[j].getAge() + " The height is " + children[j].getHeight());
			j = j - 1;
		}
	}
}

class Child {

	private String name;
	private int age;
	private int height;

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	public int getHeight() {
		return height;
	}
}