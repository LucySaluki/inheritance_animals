import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumanTest {

    Human human = new Human("Human", "Homo sapiens");

    @Test
    public void canEat(){
        assertEquals("Nom nom nom", human.eat());
    }

    @Test
    public void canBreathe(){
        assertEquals("sigh", human.breathe());
    }

    @Test
    public void canTalk(){
        assertEquals("Talking", human.talk());
    }

    @Test
    public void canWalk(){
        assertEquals("And were walking!", human.walk());
    }
}