package dao;

import com.sun.jdi.connect.spi.Connection;
import models.Departments;
import models.Users;

import java.util.ArrayList;
import java.util.List;

public class Sql2oUsersDao implements UsersDao{

    private final Sql2o sql2o;

    public Sql2oUsersDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void add(Users user) {
        try (Connection con=sql2o.open()){
            String sql ="INSERT INTO staff (name,position,staff_role) VALUES (:name,:position,:staff_role) ";

            int id=(int) con.createQuery(sql,true)
                    .bind(user)
                    .executeUpdate()
                    .getKey();
            user.setId(id);


        }catch (Sql2oException e){
            System.out.println(e);
        }

    }

    @Override
    public List<Users> getAll() {
        try (Connection con=sql2o.open()){
            String sql=("SELECT * FROM staff");
            return con.createQuery(sql)
                    .executeAndFetch(Users.class);
        }
    }

    @Override
    public List<Departments> getAllUserDepartments(int user_id) {
        List<Departments> departments=new ArrayList<>();
        try (Connection con=sql2o.open()) {
            String sql = "SELECT department_id FROM users_departments WHERE user_id=:user_id";
            List<Integer> departmentIds = con.createQuery(sql)
                    .addParameter("user_id", user_id)
                    .executeAndFetch(Integer.class);

            for (Integer id : departmentIds) {
                String userResults = "SELECT * FROM departments WHERE id=:id";
                departments.add(con.createQuery(userResults)
                        .addParameter("id", id)
                        .executeAndFetchFirst(Departments.class));

            }

            return departments;
        }
    }
}
