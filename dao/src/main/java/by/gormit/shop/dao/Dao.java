// class which works with mySql

package by.gormit.shop.dao;

import java.util.List;


public interface Dao<T>
{
    T get(int id);
    List<T> getList();
    boolean add(T t);
    void delete(int id);
    void update(int id, T t);
    int getId(String name);
}
