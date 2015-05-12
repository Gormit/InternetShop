package by.gormit.shop.dao;

import by.gormit.shop.Users;
import by.gormit.shop.constance.Constance;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Марина on 08.05.2015.
 */
public class UsersDao extends BaseDao<Users> implements IUsersDao {

    private static final Logger logger = Logger.getLogger(UsersDao.class);

    public Users auth(String email, String pass) {
        Users user = null;
        try {
            Connection connection = BaseDao.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(Constance.SQL_QUERY_GET_USER_AUTH);
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
            connection.close();
        }
        catch (SQLException e) {
            logger.error("MySql error: " + e);
        }
        return user;
    }

    public void changeBunStatus(Users user) {
        try {
            Connection connection = BaseDao.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(Constance.SQL_QUERY_CHANGE_BUN_STATUS);
            if (user.getBunned() == 0){
                preparedStatement.setInt(1, 1);
            } else {
                preparedStatement.setInt(1, 0);
            }
            preparedStatement.setInt(2, user.getId());
            preparedStatement.executeUpdate();
            connection.close();
        }
        catch (SQLException e) {
            logger.error("MySql error: " + e);
        }
    }


    public Users get(int id) {
        Users user = null;
        try {
            Connection connection = BaseDao.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(Constance.SQL_QUERY_GET_USER_BY_ID);
            preparedStatement.setInt(1, id);
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
            connection.close();
        } catch (SQLException e) {
            logger.error(e);
        }

        return user;
    }

    public List<Users> getList() {
        List<Users> users = new ArrayList<Users>();
        try {
            Connection connection = BaseDao.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(Constance.SQL_QUERY_GET_LIST_USERS);
            while (resultSet.next()) {
                Users user = new Users();
                user.setId(resultSet.getInt("id"));
                user.setFirstname(resultSet.getString("firstname"));
                user.setLastname(resultSet.getString("lastname"));
                user.setMail(resultSet.getString("mail"));
                user.setPassword(resultSet.getString("password"));
                user.setRole(resultSet.getInt("role"));
                user.setBunned(resultSet.getInt("bunned"));
                users.add(user);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            this.logger.error(e);
        }
        return users;
    }

    public boolean add(Users user) {
        try {
            Connection connection = BaseDao.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(Constance.SQL_QUERY_CHECK_USER_IS_BASE);
            preparedStatement.setString(1, user.getMail());
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return false;
            } else {
                int id = 1;
                Statement statement = connection.createStatement();
                ResultSet result = statement.executeQuery(Constance.SQL_QUERY_GET_USER_LAST_ID);
                if (result.next()) {
                    id += result.getInt("id");
                }

                preparedStatement = connection.prepareStatement(Constance.SQL_QUERY_ADD_USER);
                preparedStatement.setInt(1, id);
                preparedStatement.setString(2, user.getFirstname());
                preparedStatement.setString(3, user.getLastname());
                preparedStatement.setString(4, user.getMail());
                preparedStatement.setString(5, user.getPassword());
                preparedStatement.setInt(6, 2);
                preparedStatement.setInt(7, 0);
                preparedStatement.executeUpdate();
                connection.close();
                return  true;
            }
        } catch (SQLException e) {
            logger.error(e);
            return false;
        }
    }

    public void delete(int id) {

    }

    public void update(int id, Users users) {

    }

    public int getId(String name) {
        return 0;
    }
}
