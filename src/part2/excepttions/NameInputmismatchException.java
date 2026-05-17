package part2.excepttions;

public class NameInputmismatchException extends RuntimeException {

    public NameInputmismatchException(String text) {
        super("В параметры надо указать имя и фамилию, но было указано: " + text);
    }

}
