package by.gormit.shop.dao;

import by.gormit.shop.Goods;
import by.gormit.shop.constance.Constance;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Марина on 08.05.2015.
 */
public class GoodsDao extends BaseDao<Goods> implements IGoodsDao{

    private static final Logger logger = Logger.getLogger(GoodsDao.class);

    public Goods get(int id) {
        return null;
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

    public boolean add(Goods goods) {
        return false;
    }

    public void delete(int id) {

    }

    public void update(int id, Goods goods) {

    }

    public int getId(String name) {
        return 0;
    }
}
