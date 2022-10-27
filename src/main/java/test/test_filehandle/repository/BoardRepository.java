package test.test_filehandle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.test_filehandle.entity.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {
}
