package HomeWork3;

import java.util.Scanner;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {


        Supplier<Human> firstName = () -> {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите фамилию: ");
            String name = in.nextLine();
            return new Human(name);
        };
        Supplier<Human> lastName = () -> {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите имя: ");
            String name = in.nextLine();
            return new Human(name);
        };
        Supplier<Human> age = () -> {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите возраст: ");
            String name = in.nextLine();
            return new Human(name);
        };
        Supplier<Human> phone = () -> {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите номер телефона: ");
            String name = in.nextLine();
            return new Human(name);
        };

        Supplier<Human> apper = () -> {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите роль в семье: ");
            String name = in.nextLine();
            return new Human(name);
        };
        Human fName_1 = firstName.get();
        Human lName_1 = lastName.get();
        Human age_1 = age.get();
        Human phone_1 = phone.get();
        Human apper_1 = apper.get();

        Human fName_2 = firstName.get();
        Human lName_2 = lastName.get();
        Human age_2 = age.get();
        Human phone_2 = phone.get();
        Human apper_2 = apper.get();

        System.out.println(apper_1.getName() + ": " + fName_1.getName() + " " + lName_1.getName() + " " + age_1.getName() + " лет, нормер телефона " + phone_1.getName());

        System.out.println(apper_2.getName() + ": " + fName_2.getName() + " " + lName_2.getName() + " " + age_2.getName() + " лет, нормер телефона " + phone_2.getName());

    }
}
