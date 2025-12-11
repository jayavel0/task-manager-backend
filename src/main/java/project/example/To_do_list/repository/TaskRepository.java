package project.example.To_do_list.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.example.To_do_list.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}

