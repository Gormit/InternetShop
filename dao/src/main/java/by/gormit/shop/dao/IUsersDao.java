//class UserDao extends class BaseDao

package by.gormit.shop.dao;

import by.gormit.shop.Users;
import java.util.List;


public interface IUsersDao extends Dao<Users>
{
    Users get(int id);
    List<Users> getList();
    boolean add(Users user);
    void delete(int id);
    void update(int id, Users user);
    int getId(String name);
    Users auth(String email, String pass);
    void changeBunStatus(Users user);
}
