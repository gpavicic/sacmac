package rs.sacmac.app.service;

import java.util.List;

import rs.sacmac.app.testModel.User;

/**
 * @author stenci
 *
 */
public interface UserService {
	
	 public void insertData(User user);  
	 public List<User> getUserList();  
	 public void deleteData(String id);  
	 public User getUser(String id);  
	 public void updateData(User user);  

}
