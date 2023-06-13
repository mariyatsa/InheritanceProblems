package ru.netology;

public class Epic extends Task {
    protected String[] subtasks;

    public Epic(int id, String[] subtasks) {
        super(id);
        this.subtasks = subtasks;
    }

    public String[] getSubtasks() {
        return subtasks;
    }

    @Override
    public boolean matches(String query) {
        String[] tmp = new String[subtasks.length + 1];// создаем новый массив который будет равен старому +1
        for (int i = 0; i < subtasks.length; i++) {
            tmp[i] = subtasks[i];
            if (subtasks[subtasks.length].contains(query))// созданный массив спрашиваем, есть ли там то что мы искали
                    return true;
            }
            return false;
        }
    }
