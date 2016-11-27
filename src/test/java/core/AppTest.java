package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AppTest {
	@BeforeClass
	public static void beforeClass() throws Exception {
		System.out
				.println("Before Class method will be executed before first test method starts");
	}

	@AfterClass
	public static void afterClass() throws Exception {
		System.out
				.println("After Class method will be executed before first test method completed");

	}

	@Before
	public void beforeMethod() throws Exception {
		System.out
				.println("Before method will executed before every test method");

	}

	@After
	public void afterMethod() throws Exception {
		System.out.println("After method will execute after every test method");

	}

	@Test
	// @Ignore
	public void test_01_AssertEquals_Positive() {
		assertEquals("Not equals", "JUnit 4.12", App.s);
	}

	@Test
	// @Ignore
	public void test_02_AssertEquals_Nagative() {
		assertEquals("Not equals", "JUnit 4.13", App.s);
	}

	@Test
	@Ignore
	public void test_03_AssertEquals_Ignore() {
		assertEquals("Not equals", "JUnit 4.12", App.s);
	}

	@Test
	// @Ignore
	public void test_04_AssertEquals_Positive() {
		assertSame("Integer not the same", 39, App.i);
	}

	@Test
	// @Ignore
	public void test_05_AssertEquals_Negative() {
		assertSame("Integer not the same", 40, App.i);
	}

	@Test
	@Ignore
	public void test_06_AssertEquals_Ignore() {
		assertSame("Not equals", 39, App.i);
	}

	@Test
	// @Ignore
	public void test_07_AssertEquals_Positive() {
		assertFalse("Must be false", App.f);
	}

	@Test
	// @Ignore
	public void test_08_AssertEquals_Negative() {
		assertFalse("Must be false", App.t);
	}

	@Test
	// @Ignore
	public void test_09_AssertEquals_Positive() {
		assertTrue("Must be false", App.t);
	}

	@Test
	// @Ignore
	public void test_10_AssertEquals_Negative() {
		assertTrue("Must be false", App.f);
	}
}
