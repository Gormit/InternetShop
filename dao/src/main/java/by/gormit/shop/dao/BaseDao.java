package by.gormit.shop.dao;

import by.gormit.shop.util.DataSource;
import org.apache.log4j.Logger;

/**
 * Created by Марина on 01.05.2015.
 */
public abstract class BaseDao<T> implements Dao<T>{

    private static final Logger logger = Logger.getLogger(BaseDao.class);

    public static DataSource getBaseDaoConnection() {

        return DataSource.getInstance();
    }
}
