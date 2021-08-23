package in.career.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.career.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
