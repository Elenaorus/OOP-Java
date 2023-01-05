package HomeWork2;



public class Parent implements Human {


    @Override
    public String firstName() {
        return "Мария";
    }

    @Override
    public String lastName() {
        return "Иванова";
    }

    @Override
    public int age() {
        return 39;
    }

    @Override
    public String phone() {
        return "89631564789";
    }

    @Override
    public String role() {
        return "Мама";
    }
}