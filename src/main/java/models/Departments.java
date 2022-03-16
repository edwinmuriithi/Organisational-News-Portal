package models;

public class Departments {

    private String name;
    private String description;
    private int id;
    private int size;



    public Departments(String name, String description) {
        this.name = name;
        this.description = description;
        this.size=0;
    }
    public String getDescription() {
        return description;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
