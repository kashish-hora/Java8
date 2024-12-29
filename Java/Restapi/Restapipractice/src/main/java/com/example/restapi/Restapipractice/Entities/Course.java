package  com.example.restapi.Restapipractice.Entities;




public class Course {

     
    private int id;
    private String name;

    
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + "]";
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public Course(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Course() {
    }
    public void setName(String name) {
        this.name = name;
    }
  
    
    
}
