package com.mydomain.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mydomain.db.UserDataDao;
import com.mydomain.model.Users;

@Path("/user")
public class UserService {

	private UserDataDao userDao = null;
	
	private UserDataDao getUserDataDao() {
		if (userDao == null) {
			userDao = UserDataDao.getInstance();
		}
		return userDao;
	}

	@GET
	@Path("/{param}")
	@Produces({MediaType.APPLICATION_JSON})
	public Users getUser(@PathParam("param") Integer id) {
		return getUserDataDao().getUser(id);
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Users> getUsers() {
		System.out.println("UserService.getUsers() getting users = "+userDao);
		return getUserDataDao().getUsers();
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	//public void createUser(@FormParam("name") String name,@FormParam("age") Integer age,@FormParam("emailId") String emailId){
	public void createUser(Users u){
		getUserDataDao().addUser(u);
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	//@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	//public void updateUser(@FormParam("id") Integer id, @FormParam("name") String name,@FormParam("age") Integer age,@FormParam("emailId") String emailId){
	public void updateUser(Users u){
		getUserDataDao().updateUser(u);
	}
	
	@DELETE
	@Path("/{param}")
	@Produces({MediaType.APPLICATION_JSON})
	public boolean deleteUser(@PathParam("param") Integer id) {
		return getUserDataDao().deleteUser(id);
	}
	
	public void setUserDataDao(UserDataDao dao) {
		userDao = dao;
	}
	
}


