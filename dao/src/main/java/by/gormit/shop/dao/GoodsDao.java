package by.gormit.shop.dao;

import by.gormit.shop.Goods;
import by.gormit.shop.constance.Constance;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Марина on 08.05.2015.
 */
public class GoodsDao extends BaseDao<Goods> implements IGoodsDao{

    private static final Logger logger = Logger.getLogger(GoodsDao.class);

    public Goods get(int id) {

        Goods good = null;
        try {
            Connection connection = BaseDao.getBaseDaoConnection().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(Constance.SQL_QUERY_GET_GOOD_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                good = new Goods();
                good.setId(resultSet.getInt("id"));
                good.setName(resultSet.getString("name"));
                good.setCategory(resultSet.getInt("category"));
                good.setManufacturer(resultSet.getInt("manufacturer"));
                good.setCount(resultSet.getInt("count"));
                good.setPrice(resultSet.getInt("price"));
                good.setDescription(resultSet.getString("description"));
            }
            connection.close();
        } catch (SQLException e) {
            logger.error(e);
        }

        return good;
    }

    public List<Goods> getList() {
        List<Goods> goods = new ArrayList<Goods>();
        try {
            Connection connection = BaseDao.getBaseDaoConnection().getConnection();
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(Constance.SQL_QUERY_GET_GOODS);
            while (result.next()) {
                Goods good = new Goods();
                good.setId(result.getInt("id"));
                good.setName(result.getString("name"));
                good.setCategory(result.getInt("category"));
                good.setManufacturer(result.getInt("manufacturer"));
                good.setCount(result.getInt("count"));
                good.setPrice(result.getInt("price"));
                good.setDescription(result.getString("description"));
                goods.add(good);
            }
            result.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            this.logger.error(e);
        }
        return goods;
    }

    public boolean add(Goods good) {
        try {
            int i = 1;
            Connection connection = BaseDao.getBaseDaoConnection().getConnection();

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(Constance.SQL_QUERY_GET_LAST_GOOD_ID);
            if (resultSet.next()) {
                i += resultSet.getInt("id");
            }
            PreparedStatement preStatement = connection.prepareStatement(Constance.SQL_QUERY_ADD_GOOD);
            preStatement.setInt(1, i);
            preStatement.setString(2, good.getName());
            preStatement.setInt(3, good.getCategory());
            preStatement.setInt(4, good.getManufacturer());
            preStatement.setInt(5, good.getCount());
            preStatement.setInt(6, good.getPrice());
            preStatement.setString(7, good.getDescription());
            preStatement.executeUpdate();
            connection.close();
            return true;
        } catch (SQLException e) {
            logger.error(e);
            return false;
        }
    }

    public void delete(int id) {
        try {
            Connection connection = BaseDao.getBaseDaoConnection().getConnection();
            PreparedStatement preStatement = connection.prepareStatement(Constance.SQL_QUERY_DELETE_GOOD);
            preStatement.setInt(1, id);
            preStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            logger.error(e);
        }
    }

    public void update(int id, Goods good) {
        try {
            Connection connection = BaseDao.getBaseDaoConnection().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(Constance.SQL_QUERY_UPDATE_GOOD);
            preparedStatement.setString(1, good.getName());
            preparedStatement.setInt(2, good.getCategory());
            preparedStatement.setInt(3, good.getManufacturer());
            preparedStatement.setInt(4, good.getCount());
            preparedStatement.setInt(5, good.getPrice());
            preparedStatement.setString(6, good.getDescription());
            preparedStatement.setInt(7, id);
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            logger.error(e);
        }
    }

    public int getId(String name) {
        try {
            Connection connection = GoodsDao.getBaseDaoConnection().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(Constance.SQL_QUERY_GET_GOOD_ID);
            preparedStatement.setString(1, name);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next())
                return resultSet.getInt(1);
        } catch (SQLException e) {
            logger.error(e);
        }
        return 0;
    }
}
