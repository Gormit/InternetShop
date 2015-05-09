package by.gormit.shop.dao;

import by.gormit.shop.Manufacturers;

import java.util.List;

/**
 * Created by Марина on 09.05.2015.
 */
public interface IManufacturersDao extends Dao<Manufacturers> {

    List<Manufacturers> getList();
}
