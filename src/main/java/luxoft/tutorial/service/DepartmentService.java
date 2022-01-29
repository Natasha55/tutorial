package luxoft.tutorial.service;

import luxoft.tutorial.entity.Department;
import luxoft.tutorial.error.DepartmentNotFoundExeption;

import java.util.List;

public interface DepartmentService {
  public Department saveDepartment(Department department);

  public List<Department> fetchDepartmentList();

  public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundExeption;

  public void deleteDepartmentById(Long departmentId);

  public Department updateDepartment(Long departmentId, Department department);

  public Department fetchDepartmentByName(String departmentName);


}
