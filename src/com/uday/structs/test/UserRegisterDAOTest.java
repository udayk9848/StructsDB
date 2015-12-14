package com.uday.structs.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.uday.struts.dao.UserRegisterDAO;

import junit.framework.TestCase;

public class UserRegisterDAOTest extends TestCase {

	private String expected = "u";
	private String expectedF = "notfound";
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
	}

	@Test
	public void test_usernamevalidation() {
		assertEquals(expected, new UserRegisterDAO().usernamevalidation("u"));
	}

	@Test
	public void test_usernamevalidation1() {
		assertEquals(expectedF, new UserRegisterDAO().usernamevalidation("mmmm"));
	}
}
