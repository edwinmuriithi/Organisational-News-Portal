package models;

public class Users {

    private int id;
    private String name;
    private String position;
    private int departmentId;
    private String role;

    public Users(int id, String name, String position, int departmentId, String role) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.departmentId = departmentId;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
