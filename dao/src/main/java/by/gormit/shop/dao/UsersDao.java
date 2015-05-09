package by.gormit.shop.dao;

import by.gormit.shop.Users;
import by.gormit.shop.constance.Constance;
import org.apache.log4j.Logger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Марина on 08.05.2015.
 */
public class UsersDao extends BaseDao<Users> implements IUsersDao {

    private static final Logger logger = Logger.getLogger(UsersDao.class);

    public Users auth(String email, String pass) {
        Users user = null;
        try {
            PreparedStatement preparedStatement = BaseDao.getBaseDaoConnection().getConnection().prepareStatement(Constance.SQL_QUERY_GET_USER_AUTH);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, pass);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                user = new Users();
                user.setId(resultSet.getInt("id"));
                user.setFirstname(resultSet.getString("firstname"));
                user.setLastname(resultSet.getString("lastname"));
                user.setMail(resultSet.getString("mail"));
                user.setPassword(resultSet.getString("password"));
                user.setRole(resultSet.getInt("role"));
                user.setBunned(resultSet.getInt("bunned"));
            }
        }
        catch (SQLException e) {
            logger.error("MySql error: " + e);
        }
        return user;
    }


    public Users get(int id) {
        return null;
    }

    public List<Users> getList() {
        return null;
    }

    public boolean add(Users users) {
        return false;
    }

    public void delete(int id) {

    }

    public void update(int id, Users users) {

    }

    public int getId(String name) {
        return 0;
    }
}
