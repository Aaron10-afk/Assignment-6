import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class CircusDriverAppJUnitTest {
    private Circus circus;

    @BeforeEach
    void setUp() {
        circus = new Circus();
    }

    @Test
    void testAddDog() {
        Dog dog = new Dog("Shila", 3, "Golden Retriever", "Brown");
        circus.addAnimal(dog);
        List<Animal> animals = circus.getAnimals();
        assertEquals(1, animals.size());
        assertTrue(animals.get(0) instanceof Dog);
        assertEquals("Shila", animals.get(0).getName());
    }

    @Test
    void testAddBird() {
        Bird bird = new Bird("Tweety", 2, "Canary", "Yellow");
        circus.addAnimal(bird);
        List<Animal> animals = circus.getAnimals();
        assertEquals(1, animals.size());
        assertTrue(animals.get(0) instanceof Bird);
        assertEquals("Tweety", animals.get(0).getName());
    }

    @Test
    void testDisplayAnimals() {
        Dog dog = new Dog("Rex", 5, "German Shepherd", "Black");
        Bird bird = new Bird("Polly", 1, "Parrot", "Green");
        circus.addAnimal(dog);
        circus.addAnimal(bird);
        List<Animal> animals = circus.getAnimals();
        assertEquals(2, animals.size());
    }

    @Test
    void testSortAnimalsByAge() {
        Dog dog = new Dog("Rex", 5, "German Shepherd", "Black");
        Bird bird = new Bird("Polly", 1, "Parrot", "Green");
        circus.addAnimal(dog);
        circus.addAnimal(bird);
        circus.sortAnimalsByAge();
        List<Animal> animals = circus.getAnimals();
        assertEquals("Polly", animals.get(0).getName());
        assertEquals("Rex", animals.get(1).getName());
    }

    @Test
    void testSortAnimalsByName() {
        Dog dog = new Dog("Rex", 5, "German Shepherd", "Black");
        Bird bird = new Bird("Polly", 1, "Parrot", "Green");
        circus.addAnimal(dog);
        circus.addAnimal(bird);
        circus.sortAnimalsByName();
        List<Animal> animals = circus.getAnimals();
        assertEquals("Polly", animals.get(0).getName());
        assertEquals("Rex", animals.get(1).getName());
    }

    @Test
    void testSearchAnimalByName() {
        Dog dog = new Dog("Rex", 5, "German Shepherd", "Black");
        Bird bird = new Bird("Polly", 1, "Parrot", "Green");
        circus.addAnimal(dog);
        circus.addAnimal(bird);
        Animal found = circus.searchAnimalByName("Polly");
        assertNotNull(found);
        assertEquals("Polly", found.getName());
        assertNull(circus.searchAnimalByName("NonExistent"));
    }

    @Test
    void testAddAndDisplayTickets() {
        Ticket ticket1 = circus.generateTicket("Monday", 100, 30); 
        Ticket ticket2 = circus.generateTicket("Monday", 100, 10);

        List<Ticket> tickets = circus.getTickets();
        assertEquals(2, tickets.size());
        assertEquals(90.0,ticket1.calculatePrice());
        assertEquals(81.0, ticket2.calculatePrice());
        
    }
}



