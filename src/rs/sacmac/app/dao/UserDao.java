package rs.sacmac.app.dao;

/**
 * @author stenci
 *
 */
import java.util.List;

import rs.sacmac.app.testModel.*;  
  
public interface UserDao {  
 public void insertData(User user);  
 public List<User> getUserList();  
 public void updateData(User user);  
 public void deleteData(String id);  
 public User getUser(String id);  
  
}
