import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
public class C21Test {

	

	public class PointTest {
	    private C21 c21;

	    @Before
	    public void before() {
	        c21 = new C21();
	    }

	    @Test
	    public void testm1() {
	        assertEquals("m1",c21.m1());
	    }
	    
	    public void testm2() {
	        assertEquals("m2",c21.m2());
	    }
	
	
	}}
