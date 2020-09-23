import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MammalTest {

    Mammal mammal = new Mammal("Chimpanzee", "Pan troglodytes");

    @Test
    public void canEat(){
        assertEquals("Nom nom nom", mammal.eat());
    }

    @Test
    public void canBreathe(){
        assertEquals("sigh", mammal.breathe());
    }

    @Test
    public void canTalk(){
        assertEquals("Talking", mammal.talk());
    }
}
