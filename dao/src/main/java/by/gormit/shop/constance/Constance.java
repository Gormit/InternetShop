package by.gormit.shop.constance;

/**
 * Created by Марина on 08.05.2015.
 */
public class Constance {
//    public static final String SQL_QUERY_GET_USER = "SELECT * FROM users WHERE id = ?;";
//    public static final String SQL_QUERY_ADD_USER = "INSERT INTO users VALUES (?, ?, ?, ?)";
//    public static final String SQL_QUERY_CHECK_USER_IS_BASE = "SELECT * FROM users WHERE email = ?;";
    public static final String SQL_QUERY_GET_USER_AUTH = "SELECT * FROM users WHERE mail = ? AND password = ?;";
//    public static final String SQL_QUERY_GET_USER_LAST_ID = "SELECT id FROM users ORDER BY id DESC LIMIT 1;";
//    public static final String SQL_QUERY_GET_USER_ID = "SELECT id FROM users WHERE email = ?;";
//    public static final String SQL_QUERY_DELETE_USER = "DELETE FROM users WHERE id = ?;";

//    public static final String SQL_QUERY_GET_BOOK = "SELECT * FROM books WHERE id = ?;";
    public static final String SQL_QUERY_GET_GOODS = "SELECT * FROM goods;";
//    public static final String SQL_QUERY_CHECK_BOOK_IS_BASE = "SELECT * FROM books WHERE name = ? AND author = ?;";
//    public static final String SQL_QUERY_GET_LAST_BOOK_ID = "SELECT id FROM books ORDER BY id DESC LIMIT 1;";
//    public static final String SQL_QUERY_ADD_BOOK = "INSERT INTO books VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
//    public static final String SQL_QUERY_DELETE_BOOK = "DELETE FROM books WHERE id = ?;";
//    public static final String SQL_QUERY_UPDATE_BOOK = "UPDATE books SET name = ?, description = ?, author = ?, date = ?, cost = ?, user_id = ?, category_id = ? WHERE id = ?;";
//    public static final String SQL_QUERY_GET_BOOK_ID = "SELECT id FROM books WHERE name = ?;";
}
