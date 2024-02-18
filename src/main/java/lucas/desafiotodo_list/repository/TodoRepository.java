package lucas.desafiotodo_list.repository;

import lucas.desafiotodo_list.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
