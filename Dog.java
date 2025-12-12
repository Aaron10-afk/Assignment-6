import java.util.Objects;

public class Dog implements Animal, Cloneable {
    // Instance variables
    private String name;
    private int age;
    protected String species;
    protected String color;

    // Constructor
    public Dog(String name, int age, String species, String color) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.color = color;
    }

    @Override
   	public void move() {
   		System.out.println(name + " is walking around");
   	}

   	@Override
   	public void makeSound() {
   		System.out.println(name + " is barking");
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
   	public Dog clone() {
   	    try {
   	        return (Dog) super.clone(); 
   	    } catch (CloneNotSupportedException e) {
   	        throw new AssertionError("Cloning not supported", e);
   	    }
   	}

   	@Override
   	public boolean equals(Object obj) {
   		if (this == obj) { // Check for reference equality
   			return true;
   		}
   		if (obj == null || getClass() != obj.getClass()) {// Check for null or different class
   			return false;
   		}
   		Dog other = (Dog) obj;// Compare fields for logical equality
   		return this.age == other.age && this.name.equals(other.name) && this.species.equals(other.species)
   				&& this.color.equals(other.color);
   	}

   	@Override
   	public String toString() {
   		return "Dog (Name= " + name + " Age= " + age + " Species= " + species + " Color= " + color + ")";
   	}    
}    
