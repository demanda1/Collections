package example;

public class Dog {
	private String name;
	private String breed;
	public Dog() {
		
	}
	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public void createLivingThings() {
		System.out.println("AA");
		//anonymous inner class
		LivingThings livingThings =new LivingThings() {
			@Override
			public void walk() {
				System.out.println("Dog Name:"+ getName()+ "  Dog Breed: "+ getBreed()+ "can also walk");
			}
		};
		livingThings.walk();
	}
	
}
