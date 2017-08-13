/**
 * 
 */
package rs.sacmac.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;

import rs.sacmac.app.testModel.User;

/**
 * @author stenci
 *
 */
public class UserExtractor {

	public User extractData(ResultSet resultSet) throws SQLException, DataAccessException  {
		User user = new User();

		user.setUserId(resultSet.getInt(1));
		user.setFirstName(resultSet.getString(2));
		return user;
	}

}
