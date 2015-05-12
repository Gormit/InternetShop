package by.gormit.shop.dao;

import by.gormit.shop.util.DataSource;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by Марина on 01.05.2015.
 */
public abstract class BaseDao<T> implements Dao<T>{

    private static final Logger logger = Logger.getLogger(BaseDao.class);

    public static Connection getConnection() {

        try {
            return DataSource.getInstance().getConnection();
        } catch (SQLException e) {
            logger.error(e);
            return  null;
        }
    }
}
