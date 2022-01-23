package luxoft.tutorial.repository;

import luxoft.tutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
//    Department saveDepartment(Department department);
}
