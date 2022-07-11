import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;

class GreetTest {
    Greet objGreet=new Greet();
@Test
    public void greetpersonshouldreturnhellowithname() {
    String personName=objGreet.GreetPersonWithName("Bob");
    Assertions.assertEquals("Hello Bob!",personName);
    }
    @Test
    public void greetpersonisnullthenreturnhellofriends() {
        String personName=objGreet.GreetPersonWithName(null);
        Assertions.assertEquals("Hello Friend!",personName);
    }
    @Test
    public void greetpersonisUppercasethenreturnHELLOJERRY() {
        String personName=objGreet.GreetPersonWithName("JERRY");
        Assertions.assertEquals("HELLO JERRY!",personName);
    }

    @Test
    public void greetpersonisArraythenreturnTwoNames() {
        String[] StrarrayName= new String[]{"Jill","Jane"};
        String personName=objGreet.GreetPersonWithTwoNames(StrarrayName);
        Assertions.assertEquals("Hello,Jill and Jane",personName);
    }

}