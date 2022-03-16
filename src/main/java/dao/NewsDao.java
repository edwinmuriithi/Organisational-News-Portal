package dao;

import models.Department_News;
import models.Departments;
import models.News;
import models.Users;

import java.util.List;

public interface NewsDao {
    //create
    void add(Departments department);
    void addUserToDepartment(Users user, Departments department);
    //read

    void addNews(News news);

    void addDepartmentNews(Department_News department_news);

    List<News> getAll();
    News findById(int id);
    List<Users> getAllUsersInDepartment(int department_id);
    List<News> getDepartmentNews(int id);
    //update
    //delete
    void clearAll();
}
