package com.project.repository;

import com.project.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query(value = "insert into emp_tbl(emp_id,emp_name, emp_salary, emp_gender, dept)" +  " Values (:empId, :empName, :empSalary, :empGender , :dept)" , nativeQuery = true )
    public  void saveEmployee(@Param("empId") Integer empId,
                              @Param("empName") String empName,
                              @Param("empSalary") double empSalary,
                              @Param("empGender") String empGender,
                              @Param("dept") String dept
                              );


}
