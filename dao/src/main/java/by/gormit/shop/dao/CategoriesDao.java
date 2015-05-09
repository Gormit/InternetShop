package by.gormit.shop.dao;

import by.gormit.shop.Categories;
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
public class CategoriesDao extends BaseDao<Categories> implements ICategoriesDao {

    private static final Logger logger = Logger.getLogger(CategoriesDao.class);

    public Categories get(int id) {
        Categories category = null;
        try {
            Connection connection = BaseDao.getBaseDaoConnection().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(Constance.SQL_QUERY_GET_CATEGORY);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                category = new Categories();
                category.setId(resultSet.getInt("id"));
                category.setName(resultSet.getString("name"));
            }
            connection.close();
        } catch (SQLException e) {
            logger.error(e);
        }

        return category;
    }

    public List<Categories> getList() {
        return null;
    }

    public boolean add(Categories categories) {
        return false;
    }

    public void delete(int id) {

    }

    public void update(int id, Categories categories) {

    }

    public int getId(String name) {
        return 0;
    }
}
