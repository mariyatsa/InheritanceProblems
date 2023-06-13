import org.testng.annotations.Test;
import org.testng.internal.junit.ArrayAsserts;
import ru.netology.*;

public class TodosTest {
    @Test
    public void shouldAddThreeTasksOfDifferentType() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

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
        SimpleTask simpleTask = new SimpleTask(5, "Кошка");

        String[] subtasks = {"Молоко", "Кошка", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Кошка",
                "Во вторник после обеда"
        );

        Todos todos = new Todos();

        todos.search("Кошка"); /// ???

        Task[] expected = {simpleTask, epic, meeting};
        Task[] actual =  ///???? у какого метода получаем ответ??
                ArrayAsserts.assertArrayEquals(expected, actual);
    }
}
