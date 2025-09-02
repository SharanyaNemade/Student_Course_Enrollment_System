package com.studentmgm.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentmgm.entity.Enrollment;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
    // Example custom query:
    // List<Enrollment> findByStudentId(Long studentId);
    // List<Enrollment> findByCourseId(Long courseId);
}
