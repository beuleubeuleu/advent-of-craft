package people;

import java.util.List;

public class Population{

    private List<Person> population;

    public Population(Person... population) {
        this.population = List.of(population);
    }

    public Person youngestPetOwner() {
        return null;
    }
    
}
