class Bear {

	private String name;
	private int age;

	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}

	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}

class BearTestDrive {

	public static void main(String[] args) {
		Bear ipalit = new Bear();
		String nameIpalit = "Ipalit";
		int ageIpalit = 5;
		ipalit.setName(nameIpalit);
		ipalit.setAge(ageIpalit);
		System.out.println("The name is - " + ipalit.getName());
		System.out.println("The age is - " + ipalit.getAge());
	}
}