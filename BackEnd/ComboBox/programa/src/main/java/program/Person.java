package program;

public class Person {
    
    private Long id;
    private String name;
    private String email;

    public Person(Long id, String name, String email)
    {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        
        return name;
    }  
}
