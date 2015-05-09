// class BookDao extends class BaseDao

package by.gormit.shop.dao;

import by.gormit.shop.Goods;

import java.util.List;



public interface IGoodsDao extends Dao<Goods> {
    Goods get(int id);
    List<Goods> getList();
    boolean add(Goods good);
    void delete(int id);
    void update(int id, Goods good);
    int getId(String name);
}
