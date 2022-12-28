package HomeWork1;

public class Child extends Human {

    public Child (String firstName, String lastName, int age, String role){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.role = role;
    }
    @Override
    public String apper() {
        return "Ребенок";
    }
}
