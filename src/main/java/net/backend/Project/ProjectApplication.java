package net.backend.Project;

import net.backend.Project.Repository.EmployeeRepository;
import net.backend.Project.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {SpringApplication.run(ProjectApplication.class, args);}

			@Autowired
			private EmployeeRepository employeeRepository;


			@Override
			public void run (String...args) throws Exception {
	//		Employee employee = new Employee();
	//		employee.setFirstName("sami");
	//		employee.setLastName("morris");
	//		employee.setEmailId("samimorris@gmail.com");
	//		employeeRepository.save(employee);

	//		Employee employee1 = new Employee();
	//		employee1.setFirstName("leya");
	//		employee1.setLastName("slaya");
	//		employee1.setEmailId("leyaslaya@gmail.com");
	//		employeeRepository.save(employee1);

		}
		}

