package HomeWork2;



public class Main {
    public static void main(String[] args){
        Parent obj = new Parent();
        Child obj_1 = new Child();

        System.out.println(obj.apper() + ": "+obj.firstName() + " " + obj.lastName() + " " + obj.age() + " лет, нормер телефона " + obj.phone() + ", роль в семье " + obj.role());

        System.out.println(obj_1.apper() + ": "+obj_1.firstName() + " " + obj_1.lastName() + " " + obj_1.age() + " лет, нормер телефона " + obj_1.phone() + ", роль в семье " + obj_1.role());


    }
}
