package project.example.To_do_list.service;

import java.util.List;
import project.example.To_do_list.model.Task;

public interface TaskService {

    Task addTask(Task task);
    List<Task> getAllTasks();
    void deleteTask(Long id);
}

