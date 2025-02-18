package com.detection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@SpringBootApplication
@RestController
public class DetectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DetectionApplication.class, args);
	}
	@PostMapping("/add-employee")
	public ResponseEntity<HashMap<String,Object>> addEmployeeList(){
		HashMap<String,Object> response=new HashMap<String,Object>();
		List<Employee> employees =List.of(
				new Employee(101, "Pawan Barthunia",
						"FSSP", "Male", 2345678.89),
				new Employee(102, "Ritesh Barthonia",
						"RSK", "Male", 1345678.89),
				new Employee(103, "Pankaj Panth",
						"FSSP", "Male", 4345678.89),
				new Employee(104, "Vishvanath Kadam",
						"FSSP", "Male", 3345678.89),
				new Employee(105, "Ashok Varma",
						"Jeffries", "Male", 345678.89),
				new Employee(106, "Meghna Jaiswal",
						"UBS", "Male", 45678.89),
				new Employee(107, "Ulka Matakor",
						"HR", "Male", 2745678.89),
				new Employee(108, "Jignesh Varma",
						"HR", "Male", 1845678.89),
				new Employee(109, "Mukesh Kumar",
						"PMO", "Male", 2045678.89),
		new Employee(110, "Manoj Kumar",
				"Jeffries", "Male", 2645678.89)

		);
	 response.put("status", true);
	 response.put("payload", employees);
	 response.put("code", 200);
	 return new ResponseEntity<>(response, HttpStatus.OK);
	}


}
