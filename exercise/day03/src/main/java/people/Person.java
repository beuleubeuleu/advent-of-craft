package people;

import java.util.ArrayList;
import java.util.List;

public record Person(String firstName, String lastName, Pets pets) {
    public Person(String firstName, String lastName, Pet... pets) {
        this(firstName, lastName, new Pets(pets));
    }

    public Person addPet(PetType petType, String name, int age) {
        pets.addPet(new Pet(petType, name, age));
        return this;
    }
}
