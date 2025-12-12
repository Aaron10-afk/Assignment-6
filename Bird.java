import java.util.Objects;

public class Bird implements Animal {
	// instance variables
	private String name;
	private int age;
	private String species;
	private String color;

	// constructor
	public Bird(String name, int age, String species, String color) {
		this.name = name;
		this.age = age;
		this.species = species;
		this.color = color;
	}

	@Override
	public void move() {
		System.out.println(name + " is flying around");
	}

	@Override
	public void makeSound() {
		System.out.println(name + " is chirping");
	}

	@Override
	public String getName() {
	    return name;
	}

	@Override
	public int getAge() {
	    return age;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) { // Check for reference equality
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {// Check for null or different class
			return false;
		}
		Bird other = (Bird) obj;// Compare fields for logical equality
		return this.age == other.age && this.name.equals(other.name) && this.species.equals(other.species)
				&& this.color.equals(other.color);
	}

	@Override
	public String toString() {
		return "Bird (Name= " + name + " Age= " + age + " Species= " + species + " Color= " + color + ")";
	}

}
