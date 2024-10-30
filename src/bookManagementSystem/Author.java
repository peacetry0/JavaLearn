package bookManagementSystem;

public class Author extends BaseEntity{

     private String name ;
     private String surName ;

    public Author(Long id , String name, String surName) {
        setId(id);
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id='" + getId() +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}
