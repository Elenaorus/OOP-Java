package HomeWork1;

public class Human {
    String firstName;
    String lastName;
    int age;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    String phone;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    String role;
    String appear;




    public Human(){
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.phone = "";
        this.role = "";
    }

    public Human (String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public void greetings(String msg){ System.out.println(msg);}

    public  void printInfo(){ System.out.println(printString());}

    public String apper() {
        return "Родитель";
    }



    private String printString() {
        return apper() + " " + "Human{" +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", age = '" + age + '\'' +
                ", phone = '" + phone + '\'' +
                ", role = '" + role + '\'' +
                '}';
    }




}
