package project.example.To_do_list.service;

import java.util.List;

import org.springframework.stereotype.Service;
import project.example.To_do_list.model.Task;
import project.example.To_do_list.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository repo;

    public TaskServiceImpl(TaskRepository repo) {
        this.repo = repo;
    }

    @Override
    public Task addTask(Task task) {
        return repo.save(task);
    }

    @Override
    public List<Task> getAllTasks() {
        return repo.findAll();
    }

    @Override
    public void deleteTask(Long id) {
        repo.deleteById(id);
    }
}

