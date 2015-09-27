import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
public class C22Test {
	private C22 c22;
	
	 @Before
	    public void before() {
	        c22 = new C22();
	    }

	    @Test
	    public void testm1() {
	        assertEquals("m1",c22.mA());
	    }

}
