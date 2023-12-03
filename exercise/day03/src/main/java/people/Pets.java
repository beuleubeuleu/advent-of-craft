package people;

import java.util.List;

public class Pets {

  private List<Pet> pets;

  public Pets(Pet... pets) {
    this.pets = List.of(pets);
  }

  public List<Pet> addPet(Pet pet) {
    this.pets.add(pet);
    return this.pets;
  }
}
