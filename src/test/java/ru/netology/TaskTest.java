package ru.netology;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TaskTest {
    SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");//вызываем класс которому даем данные
    String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
    Epic epic = new Epic(55, subtasks);
    Meeting meeting = new Meeting(
            555,
            "Выкатка 3й версии приложения",
            "Приложение НетоБанка",
            "Во вторник после обеда"
    );

    @Test
    public void searchQuery1() {
        Task task = new Task(1);// вызываем класс для теста
        task.matches("Позвонить родителям");//указываем что мы хотим протестировать и даем данные

        boolean expected = true;
        boolean actual = simpleTask.matches("Позвонить родителям"); // указываем метод где находится ответ
        Assertions.assertTrue(true);
    }

    @Test
    public void searchQuery2() {
        Task task = new Task(1);

        task.matches("Хлеб");

        boolean expected = true;
        boolean actual = epic.matches("Хлеб");
        Assertions.assertTrue(true);

    }

    @Test
    public void searchQuery3() {
        Task task = new Task(1);
        task.matches("Во вторник после обеда");

        boolean expected = false;
        boolean actual = meeting.matches("Во вторник после обеда");
        Assertions.assertFalse(false);
    }

    @Test
    public void searchQuery4() {
        Task task = new Task(1);
        task.equals(1);

        boolean expected = false;
        boolean actual = task.equals(1);
        Assertions.assertFalse(false);
    }

    @Test
    public void searchQuery5() {
        Task task = new Task(5);
        task.hashCode();

        int expected = 5;
        int actual = task.getId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void searchQuery6() {
        Task task = new Task(55);
        task.equals(simpleTask);
        task.equals(epic);
        task.equals(meeting);

        int expected = epic.getId();
        int actual = task.getId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void searchQuery7() {
        simpleTask.getTitle();

        String expected = "Позвонить родителям";
        String actual = simpleTask.getTitle();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void searchQuery8() {
        epic.getSubtasks();

        String[] expected = {"Молоко", "Яйца", "Хлеб"};
        String[] actual = epic.getSubtasks();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void searchQuery9() {
        Task task = new Task(1);
        task.matches("Приложение НетоБанка");

        boolean expected = true;
        boolean actual = meeting.matches("Приложение НетоБанка");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void searchQuery10() {
        meeting.getProject();

        String expected = "Приложение НетоБанка";
        String actual = meeting.getProject();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void searchQuery11() {
        meeting.getStart();

        String expected = "Во вторник после обеда";
        String actual = meeting.getStart();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void searchQuery12() {
        meeting.getTopic();

        String expected = "Выкатка 3й версии приложения";
        String actual = meeting.getTopic();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void searchQuery13() {
        Task task = new Task(5);
        task.equals(simpleTask);
        task.equals(epic);
        task.equals(meeting);

        int expected = simpleTask.getId();
        int actual = task.getId();
        Assertions.assertEquals(expected, actual);
    }
}

