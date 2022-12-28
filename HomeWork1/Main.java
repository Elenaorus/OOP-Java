package HomeWork1;

public class Main {
    public static void main(String[] args){
        Parent ivanova = new Parent("Мария","Иванова", 38);
        ivanova.setRole("мама");
        String rol = ivanova.getRole();
        ivanova.printInfo();


        Child ivanov = new  Child("Василий","Иванов", 12, "сын");
        ivanov.setPhone("11544599");

        String phon = ivanov.getPhone();
        System.out.println(phon);
        ivanov.printInfo();

    }
}
