package com.kozao.model.data;

import java.util.List;

import com.kozao.model.objet.User;



public interface UserService {
	
	User addUser(User user);
	
	User updateUser(User user);
	
	int disableUser(int id);
	
	int enableUser(int id);
	
	int deleteUser(int id);
	
	int findUserById(int id);
	
	User findUserByName(String name);
	
	User findUserByFirstName(String firstName);

	List<User> findAllUser() ;

}
