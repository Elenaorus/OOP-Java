package HomeWork1;

public class Parent extends Human {

    public Parent (String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    @Override
    public String apper() {
        return "Родитель";
    }
}
