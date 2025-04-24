import java.time.OffsetDateTime;

public class Person {

    private final String name;

    private int age;

    private int lastYearAgeInc = OffsetDateTime.now().getYear();

    public Person(String name) {
        this.name = name;
        this.age = 1;
    }

    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
