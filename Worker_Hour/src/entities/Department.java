package Worker_Hour.src.entities;

public class Department {
    private String name;

    // Empty Constructor
    public Department(){

    }

    // Constructor with objects
    public Department(String name){
        this.name = name;
    }

    //Getter and Setter
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}