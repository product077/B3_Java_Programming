package day40_exceptions.person;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if (name == null || name.isEmpty()){
            //    System.out.println();
            throw new Exception("cannot be empty");
    }else{
        this.name = name;
    }

}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
