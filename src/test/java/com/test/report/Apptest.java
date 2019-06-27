package com.test.report;

import org.junit.Test;

import junit.framework.Assert;


/**
 * Unit test for simple App.
 */
public class Apptest {
	@Test
	public void testHello() {
		App he = new App();
		String name = he.Hello("Tom");
		// 判断 Hello 传入的参数是否是 "maven"
		Assert.assertEquals("Tom", name);
    }
}
// extends TestCase
// {
// /**
// * Create the test case
// *
// * @param testName name of the test case
// */
// public AppTest( String testName )
// {
// super( testName );
// }
//
// /**
// * @return the suite of tests being tested
// */
// public static Test suite()
// {
// return new TestSuite( AppTest.class );
// }
//
// /**
// * Rigourous Test :-)
// */
// public void testApp()
// {
// assertTrue( true );
// }
// }
