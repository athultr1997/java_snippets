package classes_intro;

public class Dog extends Animals {
	private String name;
	private String breed;

	public Dog(String name, Integer age, String breed) {
		this.name = name;
		this.age = age;
		this.breed = breed;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}	

	public void setBreed(String breed) {
		this.breed = breed;
	}	

	public String getName() {
		return this.name;
	}
	
	public Integer getAge() {
		return this.age;
	}	

	public String getBreed() {
		return this.breed;
	}

	@Override
	public String toString() {
		return "{ Name: " + this.name + ", Age: " + this.age + ", Breed: " + this.breed + "}";
	}	
}