package com.mydomain.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mydomain.model.Users;

@Path("/user")
public class UserService {

	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<Users> getUsers() {
		Users user = new Users("Nandish", "nandibal@cisco.com", "#####23", new Date(), 30, "KA");
		List<Users> users = new ArrayList<Users>();
		users.add(user);
		return users;
	}
}
