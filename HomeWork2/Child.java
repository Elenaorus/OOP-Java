package HomeWork2;



 public class Child implements Human {


  @Override
  public String firstName() {
   return "Иван";
  }

  @Override
  public String lastName() {
   return "Иванов";
  }

  @Override
  public int age() {
   return 12;
  }

  @Override
  public String phone() {
   return "89631568963";
  }

  @Override
  public String role() {
   return "Сын";
  }

  @Override
  public String apper() {
   return "Ребенок";
  }
 }


