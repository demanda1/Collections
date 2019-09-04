package comm.example;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class TestCalculator extends TestCase{
	
	int x;
	int y;
	
	
	
	public TestCalculator(String name) {
		super(name);
	}

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		System.out.println("initialize method");
		x=20;
		y=10;
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
		System.out.println("clean-up method");
		x=0;
		y=0;
	}

	

	@Test
	public void testAddMethod() {

		Calculator c=new Calculator(x,y);
		int result=c.addMethod();
		assertEquals(30, result);
		
	}
	
	public void testsubMethod() {

		Newcalc c=new Newcalc(x,y);
		int result=c.subMethod();;
		assertEquals(10, result);
		
	}
	
	@Override
	protected void runTest() throws Throwable {
		// TODO Auto-generated method stub
		super.runTest();
	}

	@Test
	public void testcompare() {

		Calculator c=new Calculator(x,y);
		int result=c.compare();
		assertEquals(1,result);
	}
	
	//Create a TestSuite
	public static TestSuite createTestSuite() {
		TestSuite testSuite=new TestSuite("AllTests");
		testSuite.addTest(new TestCalculator("testAddMethod"));
		return testSuite;
	}
	
	
	
	public static void main(String[] args) {
		//TestRunner.run(TestCalculator.class);
		junit.textui.TestRunner.run(createTestSuite());
	}
	
}
