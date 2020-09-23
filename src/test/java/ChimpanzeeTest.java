import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChimpanzeeTest {

    Chimpanzee chimpanzee = new Chimpanzee("Chimpanzee", "Pan troglodytes");

    @Test
    public void canEat(){
        assertEquals("Nom nom nom", chimpanzee.eat());
    }

    @Test
    public void canBreathe(){
        assertEquals("sigh", chimpanzee.breathe());
    }

    @Test
    public void canTalk(){
        assertEquals("Talking", chimpanzee.talk());
    }

    @Test
    public void canWalk(){
        assertEquals("stomp stomp through the bush", chimpanzee.walk());
    }
}
