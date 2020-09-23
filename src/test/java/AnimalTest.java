import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {
    Animal animal;

    @Before
    public void before(){
        animal = new Animal("Human", "Homo sapiens");

    }

    @Test
    public void hasCommonName(){
        assertEquals("Human", animal.getCommonName());
    }

    @Test
    public void hasSpeciesName(){
        assertEquals("Homo sapiens", animal.getSpeciesName());
    }

    @Test
    public void canEat(){
        assertEquals("Nom nom nom", animal.eat());
    }

    @Test
    public void canBreathe(){
        assertEquals("sigh", animal.breathe());
    }
}
