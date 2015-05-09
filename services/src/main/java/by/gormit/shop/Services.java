package by.gormit.shop;

import by.gormit.shop.dao.CategoriesDao;
import by.gormit.shop.dao.GoodsDao;
import by.gormit.shop.dao.ManufacturersDao;
import by.gormit.shop.dao.UsersDao;

import java.util.List;

/**
 * Created by Марина on 08.05.2015.
 */
public class Services {

    public List<Goods> getGoods() {

        return new GoodsDao().getList();
    }

    public Users getAuthentication(String mail, String password) {
        return new UsersDao().auth(mail, password);
    }

    public Goods getGood(int id) {
        return new GoodsDao().get(id);
    }

    public Categories getCategory(int id) {
        return new CategoriesDao().get(id);
    }

    public Manufacturers getManufacturer(int id) {
        return new ManufacturersDao().get(id);
    }

    public boolean addGood(Goods good) {
        return new GoodsDao().add(good);
    }

    public void delGood(int id) {
        new GoodsDao().delete(id);
    }

    public void updateGood(int id, Goods good) {
        new GoodsDao().update(id, good);
    }


}
