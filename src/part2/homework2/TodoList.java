package part2.homework2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TodoList {
    static Scanner sc = new Scanner(System.in);

    private static List<String> tasks = new ArrayList<>();

    static void main() {
        boolean isContinue = true;
        while (isContinue) {
            showmenu();
            String answer = sc.nextLine();

            switch (answer) {
                case "0":
                    isContinue = false;
                    break;
                case "1":
                    addTask();
                    break;
                case "2":
                    break;
                case "3":
                    removeByNumber();
                    break;
                case "4":
                    removeByName();
                    break;
                case "5":
                    removeByKeyword();
                    break;
                default:
                    System.out.println("Я не знаю такой команды");
            }
            showTasks();
        }

    }

    private static void removeByKeyword() {
        System.out.println("Введите задачу для удаления: ");
        String keyword = sc.nextLine();

        Iterator<String> iter = tasks.iterator();
        while (iter.hasNext()) {
            String task = iter.next();
            if (task.contains(keyword)) {
                iter.remove();
            }
        }

    }

    private static void removeByName() {
        System.out.println("Введите задачу для удаления: ");
        String task = sc.nextLine();
        if (task.contains(task)) {
            tasks.remove(task);
        } else {
            System.out.println("Такой задачи нет");
        }
    }

    private static void removeByNumber() {
        System.out.print("Введите номер для удаления: ");
        int number = Integer.parseInt(sc.nextLine()) - 1;
        if (number < 1 || number >= tasks.size()) {
            System.out.println("Такой задачи нет");
        } else {
            tasks.remove(number);
        }
    }

    private static void addTask() {
        System.out.print("Введите название задачи: ");
        String task = sc.nextLine();
        tasks.add(task);
    }

    private static void showTasks() {
        System.out.println("\nВаш список дел:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, tasks.get(i));
        }
    }

    private static void showmenu() {
        System.out.print("Выберите операцию: \n" +
                "0. Выход из программы\n" +
                "1. Добавить дело\n" +
                "2. Показать дела\n" +
                "3. Удалить дело по номеру\n" +
                "4. Удалить дело по названию\n" +
                "5. Удалить дело по ключевому слову\n" +
                "Ваш выбор: ");
    }
}
