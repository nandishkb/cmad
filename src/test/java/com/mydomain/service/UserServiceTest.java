package com.mydomain.service;

import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.*;

import java.util.Date;

import com.mydomain.db.UserDataDao;
import com.mydomain.model.Users;

import junit.framework.TestCase;

public class UserServiceTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testGetUserWithId() {
		UserDataDao userDb = mock(UserDataDao.class);
		
		Users u = new Users("nandish", "nandibal@cisco.com", "$@#$", new Date(), 31, "KA");
		when(userDb.getUser(anyInt())).thenReturn(u);
		
		UserService service = new UserService();
		service.setUserDataDao(userDb);
		
		u = service.getUser(1);
		Assert.assertEquals("nandish", u.getName());
		
		when(userDb.getUser(null)).thenThrow(new IllegalArgumentException("Null ID not allowed"));
	}

}
