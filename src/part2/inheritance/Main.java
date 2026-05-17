package part2.inheritance;

public class Main {
    static void main() {
        Person person = new Person("Petya", 10);
        person.setAge(40);
        person.setAge(-8);
        person.happyBirthday();
        System.out.println(person.getAge());

        Singer singer = new Singer("Sasha", 12, 100);
        singer.happyBirthday();
        singer.sing("Good Morning");
        System.out.println(singer.toString());
    }
}
