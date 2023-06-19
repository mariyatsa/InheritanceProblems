import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import org.testng.internal.junit.ArrayAsserts;
import ru.netology.*;

public class TodosTest {
    SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
    String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
    Epic epic = new Epic(55, subtasks);
    Meeting meeting = new Meeting(
            555,
            "Выкатка 3й версии приложения",
            "Приложение НетоБанка",
            "Во вторник после обеда"
    );
    @Test
    public void shouldAddThreeTasksOfDifferentType() {

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = {simpleTask, epic, meeting};
        Task[] actual = todos.findAll();
        ArrayAsserts.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldAddThreeTasksOfDifferentType2() {

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);
        todos.search("Позвонить родителям");

        Task[] expected = {simpleTask};
        Task[] actual = todos.search("Позвонить родителям");
        ArrayAsserts.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldAddThreeTasksOfDifferentType3() {

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);
        todos.search("Молоко");

        Task[] expected = {epic};
        Task[] actual = todos.search("Молоко");
        ArrayAsserts.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldAddThreeTasksOfDifferentType4() {

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);
        todos.search("Выкатка 3й версии приложения");

        Task[] expected = {meeting};
        Task[] actual = todos.search("Выкатка 3й версии приложения");
        ArrayAsserts.assertArrayEquals(expected, actual);
    }
}

