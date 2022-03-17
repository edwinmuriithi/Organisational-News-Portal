import com.google.gson.Gson;
import dao.Sql2oDepartmentsDao;
import dao.Sql2oNewsDao;
import dao.Sql2oUsersDao;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.Collections;

public class App {
    public static void main(String[] args) {

        Sql2oNewsDao sql2oNewsDao;
        Sql2oUsersDao sql2oUserDao;
        Sql2oDepartmentsDao sql2oDepartmentsDao;
        Connection conn;
        Gson gson = new Gson();

        //setup Local connection
        String connectionString = "jdbc:postgresql://localhost:5432/organisational_news_portal";
        Sql2o sql2o = new Sql2o(connectionString, "muriithi", "123456");

        sql2oDepartmentsDao = new Sql2oDepartmentsDao(sql2o);
        sql2oNewsDao = new Sql2oNewsDao(sql2o);
        sql2oUserDao = new Sql2oUsersDao(sql2o);
        conn = sql2o.open();

        //get routes
//        get("/users", "application/json", (request, response) -> {
//            if(sql2oDepartmentsDao.getAll().size() > 0){
//                return gson.toJson(sql2oUserDao.getAll());
//            }
//            else {
//                return "{\"message\":\"I'm sorry, but no users are currently listed in the database.\"}";
//            }
//        });



    }}
