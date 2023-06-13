import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.junit.ArrayAsserts;
import ru.netology.*;
public class TaskTest {
    @Test
    public void searchQuery1() {
        SimpleTask simpleTask = new SimpleTask(5, "Кошка");//вызываем класс которому даем данные

        Task task = new Task(1);// вызываем класс для теста
        task.matches("Кошка");//указываем что мы хотим протестировать и даем данные


        boolean expected = true;
        boolean actual = simpleTask.matches("Кошка"); // указываем метод где находится ответ
        Assert.assertEquals(expected, actual);
        // верно ли составлен тест?

    }

    @Test
    public void searchQuery2() {
        String[] subtasks = {"Кошка", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Task task = new Task(1);
        task.matches("Кошка");


        boolean expected = true;
        boolean actual = epic.matches("Кошка");
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void searchQuery3() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Кошка",
                "Во вторник после обеда"
        );
        Task task = new Task(1);
        task.matches("Кошка");


        boolean expected = true;
        boolean actual = meeting.matches("Кошка");
        Assert.assertEquals(expected, actual);

    }
}
