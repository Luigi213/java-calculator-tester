package org.java.calculator;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

public class EmployeeTest {
	private Employee e;
	
	private String name;
	private String lastname;
	private LocalDate date_of_birth;
	private String role;
	
	@BeforeEach
	public void initEmployee() throws Exception {
		name = "grgr";
		lastname = "feffa";
		date_of_birth = LocalDate.parse("2024-12-12");
		role = "boss";
		
		e = new Employee(name, lastname, date_of_birth, role);
	}
	
	@RepeatedTest(1) 
	public void getTestName() throws Exception{
		
		assumeTrue(e.getName().length() <= 0);
		
		Exception exception = assertThrows(Exception.class, () -> {			
			e.getName();
		});
		
		Assertions.assertEquals("some message", exception.getMessage());
	}
	
	@RepeatedTest(1) 
	public void getTestLastname() throws Exception{
		
		assumeTrue(e.getLastname().length() <= 0);
		
		assertThrows(Exception.class, () -> 
			e.getLastname(),
			"problema cognome"
        );

	}
	
	@RepeatedTest(1) 
	public void getTestLocaldate() throws Exception{
		
		assumeTrue(LocalDate.now().isBefore(e.getDate_of_birth()));
		
		assertThrows(Exception.class, 
				() -> e = new Employee(name, lastname, date_of_birth, role),
			"problema localDate"
        );

	}
}
