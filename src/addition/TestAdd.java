package addition;
import org.junit.*;
import static org.junit.Assert.*;
/**
 * @author Anastasia
 */
public class TestAdd {
    @Test(expected = Exception.class)
    public void testAdd(){
        addit val1 = new addit(2);
        addit val2 = new addit(2);
        addit exp = new addit(4);
        addit res = val1.add(val2);      
        
        assertEquals(res,exp);
        assertEquals(new addit(3).add(new addit(3)),new addit(6));
        assertNotNull(val1);
        assertNotNull(val2);
       
    }
    
}
