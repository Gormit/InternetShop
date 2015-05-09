package by.gormit.shop.dao;

import by.gormit.shop.Categories;

import java.util.List;

/**
 * Created by Марина on 09.05.2015.
 */
public interface ICategoriesDao  extends Dao<Categories> {

    Categories get(int id);
    List<Categories> getList();
}
