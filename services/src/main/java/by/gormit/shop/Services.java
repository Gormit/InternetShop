package by.gormit.shop;

import by.gormit.shop.dao.GoodsDao;
import by.gormit.shop.dao.UsersDao;

import java.util.List;

/**
 * Created by Марина on 08.05.2015.
 */
public class Services {

    public List<Goods> getGoods() {

        return new GoodsDao().getList();
    }

    public Users getUser() {
        return new UsersDao().get(1);
    }

    public Users getAuthentication(String mail, String password) {
        return new UsersDao().auth(mail, password);
    }
}
