package by.gormit.shop.constance;

/**
 * Created by Марина on 08.05.2015.
 */
public class Constance {
    //Users qwery
    public static final String SQL_QUERY_GET_USER_BY_ID = "SELECT * FROM users WHERE id = ?;";
    public static final String SQL_QUERY_ADD_USER = "INSERT INTO users VALUES (?, ?, ?, ?, ?, ?, ?)";
    public static final String SQL_QUERY_CHECK_USER_IS_BASE = "SELECT * FROM users WHERE mail = ?;";
    public static final String SQL_QUERY_GET_USER_AUTH = "SELECT * FROM users WHERE mail = ? AND password = ?;";
    public static final String SQL_QUERY_GET_USER_LAST_ID = "SELECT id FROM users ORDER BY id DESC LIMIT 1;";
//    public static final String SQL_QUERY_GET_USER_ID = "SELECT id FROM users WHERE email = ?;";
//    public static final String SQL_QUERY_DELETE_USER = "DELETE FROM users WHERE id = ?;";
    public static final String SQL_QUERY_GET_LIST_USERS = "SELECT * FROM users";
    public static final String SQL_QUERY_CHANGE_BUN_STATUS = "UPDATE users SET bunned = ? WHERE id = ?";

    //Goods qwery

    public static final String SQL_QUERY_GET_GOOD_BY_ID = "SELECT * FROM goods WHERE id = ?;";
    public static final String SQL_QUERY_GET_GOODS = "SELECT * FROM goods;";
//    public static final String SQL_QUERY_CHECK_BOOK_IS_BASE = "SELECT * FROM books WHERE name = ? AND author = ?;";
    public static final String SQL_QUERY_GET_LAST_GOOD_ID = "SELECT id FROM goods ORDER BY id DESC LIMIT 1;";
    public static final String SQL_QUERY_ADD_GOOD = "INSERT INTO goods VALUES (?, ?, ?, ?, ?, ?, ?);";
    public static final String SQL_QUERY_DELETE_GOOD = "DELETE FROM goods WHERE id = ?;";
    public static final String SQL_QUERY_UPDATE_GOOD = "UPDATE goods SET name = ?, category = ?, manufacturer = ?, count = ?, price = ?, description = ?  WHERE id = ?;";
    public static final String SQL_QUERY_GET_GOOD_ID = "SELECT id FROM goods WHERE name = ?;";

    //Categories qwery

    public static final String SQL_QUERY_GET_CATEGORY = "SELECT * FROM categories WHERE id = ?;";

    //Manufacturers qwery

    public static final String SQL_QUERY_GET_MANUFACTURER = "SELECT * FROM manufacturers WHERE id = ?;";
}
