import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.junit.ArrayAsserts;
import ru.netology.*;

public class TaskTest {
    @Test
    public void searchQuery1() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");//вызываем класс которому даем данные

        Task task = new Task(1);// вызываем класс для теста
        task.matches("Позвонить родителям");//указываем что мы хотим протестировать и даем данные


        boolean expected = true;
        boolean actual = simpleTask.matches("Позвонить родителям"); // указываем метод где находится ответ
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void searchQuery2() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Task task = new Task(1);

        task.matches("Хлеб");

        boolean expected = true;
        boolean actual = epic.matches("Хлеб");
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void searchQuery3() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        Task task = new Task(1);
        task.matches("Во вторник после обеда");

        boolean expected = false;
        boolean actual = meeting.matches("Во вторник после обеда");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void searchQuery4() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );
        Task task = new Task(1);
        task.matches("Приложение НетоБанка");

        boolean expected = true;
        boolean actual = meeting.matches("Приложение НетоБанка");
        Assert.assertEquals(expected, actual);
    }
}
