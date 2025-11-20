import org.junit.*;
/* import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgramaInformatikoaTest {

    @Test
    void testSays() {
        ProgramaInformatikoa pi = new ProgramaInformatikoa();
        assertEquals("Hello", pi.says());
    }
}*/
public class ProgramaInformatikoaTest {
    @Test 
    public void test(){
        ProgramaInformatikoa pi= new ProgramaInformatikoa();
        Assert.assertEquals("Hello", pi.says());

    }
}
/*Test goodbye java */
    @Test 
    public void test(){
        ProgramaInformatikoa pi= new ProgramaInformatikoa();
        Assert.assertEquals("Goodbye", pi.esan());

    }
