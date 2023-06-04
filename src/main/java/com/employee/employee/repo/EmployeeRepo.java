package com.employee.employee.repo;
import java.util.Optional;
import com.employee.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
