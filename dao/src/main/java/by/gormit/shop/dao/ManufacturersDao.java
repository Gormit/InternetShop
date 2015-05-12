package by.gormit.shop.dao;

import by.gormit.shop.Manufacturers;
import by.gormit.shop.constance.Constance;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Марина on 09.05.2015.
 */
public class ManufacturersDao extends BaseDao<Manufacturers> implements IManufacturersDao {

    private static final Logger logger = Logger.getLogger(ManufacturersDao.class);

    public Manufacturers get(int id) {
        Manufacturers manufacturers = null;
        try {
            Connection connection = BaseDao.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(Constance.SQL_QUERY_GET_MANUFACTURER);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                manufacturers = new Manufacturers();
                manufacturers.setId(resultSet.getInt("id"));
                manufacturers.setName(resultSet.getString("name"));
            }
            connection.close();
        } catch (SQLException e) {
            logger.error(e);
        }

        return manufacturers;
    }

    public List<Manufacturers> getList() {
        return null;
    }

    public boolean add(Manufacturers manufacturers) {
        return false;
    }

    public void delete(int id) {

    }

    public void update(int id, Manufacturers manufacturers) {

    }

    public int getId(String name) {
        return 0;
    }
}
