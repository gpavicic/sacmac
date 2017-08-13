package rs.sacmac.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rs.sacmac.app.dao.UserDao;
import rs.sacmac.app.testModel.User;

/**
 * @author stenci
 *
 */
@Service
public class UserServiceImpl implements UserService {
	
	  
	 @Autowired  
	 UserDao userdao;  

	/* (non-Javadoc)
	 * @see rs.sacmac.app.dao.UserService#insertData(rs.sacmac.app.testModel.User)
	 */
	@Override
	public void insertData(User user) {
		userdao.insertData(user);  

	}

	/* (non-Javadoc)
	 * @see rs.sacmac.app.dao.UserService#getUserList()
	 */
	@Override
	public List<User> getUserList() {
		return userdao.getUserList();  
	}

	/* (non-Javadoc)
	 * @see rs.sacmac.app.dao.UserService#deleteData(java.lang.String)
	 */
	@Override
	public void deleteData(String id) {
		 userdao.deleteData(id);  

	}

	/* (non-Javadoc)
	 * @see rs.sacmac.app.dao.UserService#getUser(java.lang.String)
	 */
	@Override
	public User getUser(String id) {
		return userdao.getUser(id);  
	}

	/* (non-Javadoc)
	 * @see rs.sacmac.app.dao.UserService#updateData(rs.sacmac.app.testModel.User)
	 */
	@Override
	public void updateData(User user) {
		userdao.updateData(user);  

	}

}
