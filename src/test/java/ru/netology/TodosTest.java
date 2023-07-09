package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodosTest {
    SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
    String[] subtasks = {"Нетология", "Яйца", "Хлеб"};
    Epic epic = new Epic(55, subtasks);
    Meeting meeting = new Meeting(
            555,
            "Выкатка 3й версии приложения",
            "Приложение Нетология",
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
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddThreeTasksOfDifferentType2() {

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);
        //todos.search("Позвонить родителям");

        Task[] expected = {simpleTask};
        Task[] actual = todos.search("Позвонить родителям");
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldAddThreeTasksOfDifferentType3() {

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);
      //  todos.search("Молоко");

        Task[] expected = {epic};
        Task[] actual = todos.search("Яйца");
        Assertions.assertArrayEquals(expected, actual);
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
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddThreeTasksOfDifferentType5() { // находится 0 задач, т.е. ни одна задача не подходит.

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = {};
        Task[] actual = todos.search("Пограмма");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddThreeTasksOfDifferentType6() { // находится несколько задач;

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = {epic, meeting}; // <- Тут должны находиться несколько задач?
        Task[] actual = todos.search("Нетология");
        Assertions.assertArrayEquals(expected, actual);
    }
}

