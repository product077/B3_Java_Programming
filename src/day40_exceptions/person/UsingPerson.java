package day40_exceptions.person;

public class UsingPerson {

    public static void main(String[] args) {
        Person obj = new Person();
        try{
            obj.setName("John");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(obj.getName());
    }
}
