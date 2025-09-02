package com.studentmgm.repository;



import com.studentmgm.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // You can add custom query methods if needed, e.g.:
    // List<Student> findByLastName(String lastName);
    // Optional<Student> findByEmail(String email);
}
