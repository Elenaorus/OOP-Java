package HomeWork2;

public interface Human {
    String firstName();

    String lastName();

    int age();

    String phone();

    String role();

    default String apper() {

        return "Родитель";
    }
}




