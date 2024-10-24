package com.project;

import com.project.entity.Employee;
import com.project.repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.*;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DataJpaJpaRepoAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
					SpringApplication.run(DataJpaJpaRepoAppApplication.class, args);


		EmployeeRepository repository = context.getBean(EmployeeRepository.class);
/*
		Employee e1 = new Employee(1, "Mike", 5000.00,"male", "sales");

		repository.save(e1);
		System.out.println("Record saved");
*/

		/*
		Employee e1 = new Employee(1, "Mike", 5000.00,"male", "sales");
		Employee e2 = new Employee(2, "john", 15000.00,"male", "admin");
		Employee e3 = new Employee(3, "david", 25000.00,"male", "Marketing");
		Employee e4 = new Employee(4, "smith", 35000.00,"male", "account");
		Employee e5 = new Employee(5, "duke", 45000.00,"male", "Hr");
		Employee e6 = new Employee(6, "Michal", 55000.00,"male", "Management");
		Employee e7 = new Employee(7, "charles", 65000.00,"male", "sales");

		repository.saveAll(Arrays.asList(e1,e2,e3,e4,e5,e6,e7));
		System.out.println("Record saved...");

		 */

		/*
		List<Employee> emp = repository.findAll();
		for(Employee employee : emp){
			System.out.println(employee);
		}
		 */


		/*
		List<Employee> employees = repository.findAll();
		employees.forEach(System.out::println);

		 */

	//Sorting
		// sort in ascending order

		/*
		Sort sort = Sort.by("empName").ascending();

		List<Employee> emp = repository.findAll(sort);
		emp.forEach(System.out::println);

		 */
		// sort in descending order
		/*
		Sort sort = Sort.by("empName").descending();
		List<Employee> emp = repository.findAll(sort);
		emp.forEach(System.out::println);

		 */

		//Sort with multiple columns
		/*
		Sort sort = Sort.by("empName", "empSalary");
		List<Employee> emp = repository.findAll(sort);
		emp.forEach(System.out::println);

		 */

	// Pagination

		/*
		int pageNumber = 1;
		Pageable page = PageRequest.of(pageNumber - 1, 3);

		Page<Employee> findAll = repository.findAll(page);
		List<Employee> emp = findAll.getContent();
		emp.forEach(System.out::println);

		 */

	//QBE (Query By Example)

		/*
		Employee emp = new Employee();
		emp.setEmpGender("male");
		emp.setDept("admin");

		Example<Employee> example = Example.of(emp);
		List<Employee> employees = repository.findAll(example);
		employees.forEach(System.out::println);

		 */

// Inserting the data by using the custom query
		/*
	repository.saveEmployee(9,"John doe", 80000.0, "male", "IT");
		System.out.println("Employee is saved Succesfully !");

		 */


//Timestamp

		Employee emp = new Employee();
		emp.setEmpId(2);
		emp.setEmpName("David");
		emp.setEmpSalary(15000.0);
		emp.setDept("ME");
		emp.setEmpGender("Male");

		repository.save(emp);
		System.out.println("Record is saved");


	}

}
