package ClassesAndObjects.Exercise.OpinionPoll_03;

public class Person {

    private String name;
    private int age;

    // конструктор -> метод за създаване на обект от клас
    public Person (String name, int age) {
         this.name = name;
         this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

}
